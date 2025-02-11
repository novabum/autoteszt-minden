package BattleShip;

import Calculator.Simple.Objects.InvalidOperatorException;

public class Grid {
    //    kell egy 6x6-os tábla. 6x6 = 36. 36-os tömb kell.


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
        int columnNumber = (Character.getNumericValue(string.charAt(1))-1);
        int rowNumber = 0;
        switch (rowLetter) {
            case 'A' -> rowNumber = 0;
            case 'B' -> rowNumber = 1;
            case 'C' -> rowNumber = 2;
            case 'D' -> rowNumber = 3;
            case 'E' -> rowNumber = 4;
            case 'F' -> rowNumber = 5;
            default -> throw new InvalidOperatorException();
        }
        return rowNumber * 6 + columnNumber;
    }

    public static void drawShipOnGrid(int[] shipPosition, String[] gridMap){
        int shipIndexCounter = 0;
        for (int i = 0; i< shipPosition.length; i++) {
            gridMap[shipPosition[shipIndexCounter++]] = "0";
        }
    }

}
//public static void findInArray(String[] stringArray, String string){
//     switch (string){
//         case A1 -> stringArray[0]
//     }



    /*Hogy a rákba hivatkozzunk az egyes Array elemekre?
    / A = 1, B = 2?
    1 1 = Array[0]
    C3 = 3,3 Array[14] 33 az 14
    D2 = 4,2 Array[9] 6 az 9

    */


//    //jelentísük meg az egyik táblát 6 sorban.
//    public void printGrid2() {
//        int rows = 6;
//        for (int i = 0; i < 36; i++) {
//            System.out.print(grid2[i] + "  ");
//            if ((i + 1) % rows == 0) {
//                System.out.println();
//            }
//        }
//    }
