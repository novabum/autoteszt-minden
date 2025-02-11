package BattleShip;

public class Grid {
    //    kell egy 6x6-os tábla. 6x6 = 36. 36-os tömb kell.


    //Fill grids with - signs
    public static void resetGrid(String[] string) {
        for (int i = 0; i < 36; i++) {
            string[i] = "-";
        }
    }

    //prints grids in 6 rows
    public static void printGrid(String[] string) {
        int rows = 6;
        for (int i = 0; i < 36; i++) {
            System.out.print(string[i] + "  ");
            if ((i + 1) % rows == 0) {
                System.out.println();
            }
        }
    }


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
}
