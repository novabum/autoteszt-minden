package BattleShip2;

public class Grid {
    private String[] board;
    private String[] grid;

    public Grid() {
        grid = new String[36];
        for (int i = 0; i < grid.length; i++) grid[i] = "~"; // Empty water
    }


    public void printGrid() {
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
            System.out.print(grid[i] + "  ");
            if ((i + 1) % rows == 0) {
                System.out.println();
            }
        }
    }

    public void setCell(int index, String value){
        grid[index] = value;
    }

    public String getCell(int index) {
        return grid[index];
    }

    public static void drawXOnGrid(int cellShot, String[] grid){
        if (grid[cellShot].equals("□")){
            grid[cellShot] = "■";
        }
        else {
            grid[cellShot] = "X"; //mert oda már nem lőhet, ahová lőtt. Lekezelve
        }
    }
}
