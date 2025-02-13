package BattleShip;

public class Grid {

    //feltölti a grideKET ~ karakterekkel
    public static void resetGrids(String[] grid1, String[] grid2) {
        for (int i = 0; i < 36; i++) {
            grid1[i] = "~";
            grid2[i] = "~";
        }
    }

    //megjeleníti a gridet
    public static void printGrid(String[] string) {
        int rows = 6;
        System.out.println("   1  2  3  4  5  6"); //oszlopok számozása
        for (int i = 0; i < 36; i++) {
            switch (i) { // sorok betűzése
                case 0 -> System.out.print("A  ");
                case 6 -> System.out.print("B  ");
                case 12 -> System.out.print("C  ");
                case 18 -> System.out.print("D  ");
                case 24 -> System.out.print("E  ");
                case 30 -> System.out.print("F  ");
            }
            System.out.print(string[i] + "  ");
            if ((i + 1) % rows == 0) {
                System.out.println();
            }
        }
    }

    //felrajzolja a hajót a pályára
    public static void drawShipOnGrid(int[] shipCells, String[] playerMap) {
        int shipIndexCounter = 0;
        int shipLength = shipCells.length;
        for (int i = 0; i < shipLength; i++) {
            playerMap[shipCells[shipIndexCounter++]] = "□";
        }
//        else if (shipLength > 1 && shipOrientation == 1) {
//            for (int i = 0; i < shipHeadPosition.length; i++) {
//                //bla bla
//            }
//        else if (shipOrientation == 2) {
//                for (int i = 0; i < shipHeadPosition.length; i++) {
//                    //bla bla
//                }
//            }
//        }
    }
    // validálás = nem törhet sort! nem tehető más hajóra! valid input!
    public static int[] buildShipCells(int shipSize, boolean horizontal, String[] playerMap) {
        int[] shipCells = new int[shipSize];

        //elfoglalt cellák megírása. validálással
        while (true) {
            System.out.println("Add meg a hajó orrát");
            int head = UserInteractionHandler.selectionToIndex();
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


}