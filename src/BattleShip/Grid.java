package BattleShip;

public class Grid {

    //Fill grids with - signs
    public static void resetGrids(String[] string, String[] string2) {
        for (int i = 0; i < 36; i++) {
            string[i] = "-";
            string2[i] = "-";
        }
    }

    //prints grids in 6 rows
    public static void printGrid(String[] string) {
        int rows = 6;
        System.out.println("   1  2  3  4  5  6"); //oszlopok betűzése
        for (int i = 0; i < 36; i++) {
            switch (i) { // sorok számozása
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

    public static int selectionToIndex(String string) {
        string = string.toUpperCase();
        char rowLetter = string.charAt(0);
        if (rowLetter == 'A' || rowLetter == 'B' || rowLetter == 'C' || rowLetter == 'D' || rowLetter == 'E' || rowLetter == 'F') {
            int columnNumber = (Character.getNumericValue(string.charAt(1)) - 1);
            int rowNumber = 0;
            switch (rowLetter) {
                case 'A' -> rowNumber = 0;
                case 'B' -> rowNumber = 1;
                case 'C' -> rowNumber = 2;
                case 'D' -> rowNumber = 3;
                case 'E' -> rowNumber = 4;
                case 'F' -> rowNumber = 5;
            }
            return rowNumber * 6 + columnNumber;
        } else {
            throw new NullPointerException();
        }

    }

    public static void drawShipOnGrid(int[] shipHeadPosition, String[] gridMap, int shipLength, int shipOrientation) {
        int shipIndexCounter = 0;
        if (shipLength == 1) for (int i = 0; i < shipHeadPosition.length; i++) {
            gridMap[shipHeadPosition[shipIndexCounter++]] = "□";
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
}