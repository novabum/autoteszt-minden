package BattleShip;

import java.util.Arrays;

public class Ship extends Grid {
    // kell egy 1 méretű hajó, elfoglalt indexekkel és player 2 hajó elfoglalt helyekkel. Ezekből 5-5.
    private String name;
    private int[] shipCells;
    private String shipOwner;
    private boolean horizontal;
    private boolean isSunk;

    public Ship(String name, int[] shipCells, String shipOwner, boolean horizontal, boolean sunk) {
//        System.out.println(shipOwner + Arrays.toString(shipCells) + isSunk); //ellenőrzés
        this.name = name;
        this.shipCells = shipCells;
        this.shipOwner = shipOwner;
        this.horizontal = horizontal;
        this.isSunk = sunk;
    }

    public static boolean isYourShipHorizontal() {
        int shipOrientation;

        while (true) {
            try {
                shipOrientation = Integer.parseInt(UserInteractionHandler.in.next());
                if (shipOrientation == 1) {
                    return false; // Függőleges
                } else if (shipOrientation == 2) {
                    return true; // Vízszintes
                } else {
                    System.out.println("Érvénytelen! 1 asdasdvagy 2!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen!  1 vagy 2!");
            }


        }

    }

    // validálás = nem törhet sort! nem tehető más hajóra! valid input!
    public static int[] buildShipCells(int shipSize, boolean horizontal, String[] playerMap) {
        int[] shipCells = new int[shipSize];

        //elfoglalt cellák megírása. validálással
        while (true) {
            System.out.println("Add meg a hajó orrát");
            int head = Function.inputToIndex();
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
                    if (playerMap[shipCells[i]].equals("□")) {
                        throw new IllegalArgumentException("Hajók ütköznek. Próbáld újra"); //HIBA
                    }
                }
                return shipCells;//ezt csak akkor szabad visszaadni, ha minden ok
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void shipCreator(int player, String[] currentGrid, Ship[] playerShips) {
        for (int shipSizeToCreate = 1; shipSizeToCreate < 6; shipSizeToCreate++) {
            boolean isItHorizontal = false;
            UserInteractionHandler.makeAShipDialogue(player, shipSizeToCreate);
            if (shipSizeToCreate > 1) {
                isItHorizontal = Ship.isYourShipHorizontal();
            }
//            int selectedHead = UserInteractionHandler.selectionToIndex(); //Stringet validáljuk, átalakítjuk indexé
            //Ezt inkább ott kérem, ahol szükség van rá.
            int[] shipCells = Ship.buildShipCells(shipSizeToCreate, isItHorizontal, currentGrid);
            String shipName = "p" + player + "Ship" + shipSizeToCreate; //elnevezem, de minek?
            Ship currentShip = new Ship(
                    shipName,
                    shipCells,
                    "Player " + player,
                    isItHorizontal,
                    false
            );
            playerShips[shipSizeToCreate - 1] = currentShip; // beledobjuk a megfelelő arraybe. nagyon cigány módszer, ez van
//            System.out.println(Arrays.toString(shipCells)); //ellenőrzés
            Grid.drawShipOnGrid(currentShip.getShipCells(), currentGrid);
            Grid.printGrid(currentGrid);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getShipCells() {
        return shipCells;
    }

    public int getShipSize() {
        return shipCells.length;
    }

    public String getShipOwner() {
        return shipOwner;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }
}

//    private int[] p1Ship1;
//
//    public void setShipCells(int[] array) {
//        this.p1Ship1 = array;
//    }
//
//    public int[] getShipCells() {
//        return p1Ship1;
//    }



