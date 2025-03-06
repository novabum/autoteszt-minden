package BattleShip2;

public class Player {
    private final String name;
    private String[] ship;
    private Ship[] ships;
    private Grid grid;

    public Player(String name) {
        this.name = name;
        this.grid = new Grid();
        this.ships = new Ship[5];
    }

    //1-5-ig elkészítjük a hajókat. 1-esnél nem kérdezünk orientációt.
    //rá is rajzoljuk a pályára és nyomtatjuk is a kész a hajót griddel együtt
    public void buildShips() {
        grid.printGrid();
        for (int shipSizeToCreate = 1; shipSizeToCreate < 6; shipSizeToCreate++) {
            boolean isItHorizontal = false; //mert az első hajónál nem kérdezzük meg
            UserInteractionHandler.makeAShipDialogue(name, shipSizeToCreate); //kell-e orientációt kérni
            if (shipSizeToCreate > 1) {
                isItHorizontal = isYourShipHorizontal();
            }
            int[] shipCells = buildShipCells(shipSizeToCreate, isItHorizontal, grid);
            ships[shipSizeToCreate - 1] = new Ship(shipCells);
            drawShipOnGrid(shipCells, grid); //lehetne a drawshiponGrid a grid függvénye,
            //és nem kell átadni a gridet
            grid.printGrid();
        }
    }

    //bekérjük, hogy vízszintes vagy függőleges a hajó.
    private boolean isYourShipHorizontal() {
        int shipOrientation;
        while (true) {
            try {
                shipOrientation = Integer.parseInt(UserInteractionHandler.in.next());
                if (shipOrientation == 1) {
                    return false; // Függőleges
                } else if (shipOrientation == 2) {
                    return true; // Vízszintes
                } else {
                    System.out.println("Érvénytelen! 1 vagy 2!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen!  1 vagy 2!");
            }
        }
    }

    //a hajók méretének és orientációjának figyelembevételével belerajzoljuk a gridbe a hajót
    private int[] buildShipCells(int shipSize, boolean horizontal, Grid grid) {
        int[] shipCells = new int[shipSize];
        //elfoglalt cellák megírása. validálással
        while (true) {
            System.out.println("Add meg a hajó orrát");
            int head = InputConverter.inputToIndex();
            try {
                if (horizontal && (head % 6) + shipSize <= 6) { // vízszintes és el is fér
                    for (int i = 0; i < shipSize; i++) {
                        shipCells[i] = head++;
                    }

                } else if (!horizontal && head + (shipSize - 1) * 6 < 36) { //függőleges és el is fér
                    for (int i = 0; i < shipSize; i++) {
                        shipCells[i] = head;
                        head += 6;
                    }

                } else {
                    throw new IllegalArgumentException("Érvénytelen pozíció. Próbáld újra");//HIBA
                }

                //validálni kell, hogy nincs-e már rajta hajó, azaz "□" a térképen a hajó celláiból
                for (int i = 0; i < shipSize; i++) {
                    if (grid.getCell(shipCells[i]).equals("□")) {
                        throw new IllegalArgumentException("Hajók ütköznek. Próbáld újra"); //HIBA
                    }
                }
                return shipCells; //ezt csak akkor szabad visszaadni, ha minden ok
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private void drawShipOnGrid(int[] shipCells, Grid grid) {
        for (int cell : shipCells) {
            grid.setCell(cell, "□");
        }
    }

    //Ha a lövés érvényes be is rajzoluk és visszajelzést adunk a találatról.
    public void commenceFire(Player defender) {
        while (true) {
            System.out.println("Támadj!\n" + this.getName());
            int cellAttacked = InputConverter.inputToIndex();
            try {
                grid.getCell(cellAttacked);
                switch (defender.getGrid().getCell(cellAttacked)) {
                    case "■", "X" -> throw new IllegalArgumentException("Ide már lőttél. Próbáld újra:");
                    case "□" -> {
                        System.out.print("TALÁLT!!!");
                        defender.getGrid().setCell(cellAttacked, "■");
                    }
                    default -> {
                        System.out.println("Nem talált");
                        defender.getGrid().setCell(cellAttacked, "X");
                    }
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //enemy-n dolgozzuk fel a hajók sülledt boolean állapotát
    public void DamageReport() {
        for (int i = 0; i < 5; i++) {
            if (!ships[i].isSunk()) {
                boolean allCellsHit = true;
                for (int j = 0; j < ships[i].getShipCells().length; j++) {
                    if (!grid.getCell(ships[i].getShipCells()[j]).equals("■")) {
                        allCellsHit = false;
                        break;
                    }
                }
                if (allCellsHit) {
                    System.out.print("és SÜLLYEDT");
                    ships[i].setSunk(true);
                }
            }
        }
    }

    //Ha NEM minden hajó süllyedt, akkor true
    public boolean isStillAlive() {
        if (ships[0].isSunk() && ships[1].isSunk() && ships[2].isSunk() && ships[3].isSunk() && ships[4].isSunk()) {
            System.out.println("\nVége a játéknak! Minden hajó elsüllyedt.");
            return false;
        }
        return true;
    }

    //print player grid mainből hívható
    public void printPlayerGrid() {
        grid.printGrid();
    }

    public String getName() {
        return name;
    }

    public Grid getGrid() {
        return grid;
    }

}