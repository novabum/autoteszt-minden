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
            drawShipOnGrid(shipCells, grid);
            grid.printGrid();
        }
    }

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

    /// ///////////////////////////////////
    public int commenceFire(int playerNumber, String[] enemyGrid) {
        System.out.println(playerNumber + ". játékos következik!\n");
        while (true) {
            int cellAttacked = InputConverter.inputToIndex();
            try {
                return switch (enemyGrid[cellAttacked]) {
                    case "■", "X" -> throw new IllegalArgumentException("Ide már lőttél. Próbáld újra:");
                    case "□" -> {
                        System.out.print("TALÁLT!!! ");
                        yield cellAttacked;
                    }
                    default -> {
                        System.out.println("Nem talált");
                        yield cellAttacked;
                    }
                };
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

//    public void DamageReport() {
//        for (int i = 0; i < 5; i++) {
//            if (!enemyShip[i].isSunk()) {
//                boolean allCellsHit = true;
//                for (int j = 0; j < enemyShip[i].getShipCells().length; j++) {
//                    if (!enemyGrid[enemyShip[i].getShipCells()[j]].equals("■")) {
//                        allCellsHit = false;
//                        break;
//                    }
//                }
//                if (allCellsHit) {
//                    System.out.print("és SÜLLYEDT");
//                    enemyShip[i].setSunk(true);
//                }
//            }// ezt mire megszültem
//        }
//    }
//
//    public boolean allShipsDestroyed() {
//        if (ship[1].isSunk() && enemyShip[1].isSunk() && enemyShip[2].isSunk() && enemyShip[3].isSunk() && enemyShip[4].isSunk()) {
//            System.out.println("\nVége a játéknak! " + player + ". játékos minden hajója elsüllyedt.");
//            return true;
//        }
//        return false;
//    }


    public String getName() {
        return name;
    }

    public void setShip(String[] ship) {
        this.ship = ship;
    }


    public String[] getShip() {
        return ship;
    }
}