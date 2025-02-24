package BattleShip2;

public class Grid {
//    private String[] grid1 = new String[36];
//    private String[] grid2 = new String[36];


    //feltölti a grideKET ~ karakterekkel
    public void fillGridWithWater(String[] grid) {
        for (int i = 0; i < 36; i++) {
            grid[i] = "~";
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
    }

    //p1 lövését rárajzoljuk p2 táblájára
    public static void drawXOnGrid(int cellShot, String[] grid){
        if (grid[cellShot].equals("□")){
            grid[cellShot] = "■";
        }
        else {
            grid[cellShot] = "X"; //mert oda már nem lőhet, ahová lőtt. Lekezelve
        }
    }

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
