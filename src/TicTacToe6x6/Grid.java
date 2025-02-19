package TicTacToe6x6;

public class Grid extends BattleShip.Grid {

    private static String[] grid = new String[36];

    public static void fillGrid() {
        for (int i = 0; i < 36; i++) {
            grid[i] = "□";
        }
    }

    public static void printGrid() {
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

    public static void player1XOnGrid() {
        while (true) {
            int choosenCell = Function.inputToIndex();
            try {
                if (grid[choosenCell].equals("□")) {
                    grid[choosenCell] = "X";
                    return;
                } else {
                    throw new NullPointerException("Foglalt, próbáld újra");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void player2OOnGrid() {
        while (true) {
            int choosenCell = Function.inputToIndex();
            try {
                if (grid[choosenCell].equals("□")) {
                    grid[choosenCell] = "O";
                    return;
                } else {
                    throw new NullPointerException("Foglalt, próbáld újra");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean checkHorizontalWinner() {
        for (int sor = 0; sor < 6; sor++) {//minden sorba be kell néznünk
            for (int i = 0; i < 6 - 4; i++) {//pörgessük végig 0,1,2 pozícióból
                if (Grid.grid[sor * 4 + i].equals("X") &&
                        Grid.grid[sor * 4 + i + 1].equals("X") &&
                        Grid.grid[sor * 4 + i + 2].equals("X") &&
                        Grid.grid[sor * 4 + i + 3].equals("X")) {
                    System.out.println(Player.getPlayer1().getName() + " nyert! Vízszintes!");
                    return true;
                } else if (Grid.grid[sor * 4 + i].equals("O") &&
                        Grid.grid[sor * 4 + i + 1].equals("O") &&
                        Grid.grid[sor * 4 + i + 2].equals("O") &&
                        Grid.grid[sor * 4 + i + 3].equals("O")) {
                    System.out.println(Player.getPlayer2().getName() + " nyert! Vízszintes!");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkVerticalWinner() {
        for (int oszlop = 0; oszlop < 6; oszlop++) {
            for (int i = 0 + oszlop; i < 36 - 4; i += 6) {
                if (Grid.grid[i].equals("X") &&
                        Grid.grid[i + 6].equals("X") &&
                        Grid.grid[i + 6 * 2].equals("X") &&
                        Grid.grid[i + 6 * 3].equals("X")) {
                    System.out.println(Player.getPlayer1().getName() + " nyert! Függőleges!");
                    return true;
                } else if (Grid.grid[i].equals("O") &&
                        Grid.grid[i + 6].equals("O") &&
                        Grid.grid[i + 6 * 2].equals("O") &&
                        Grid.grid[i + 6 * 3].equals("O")) {
                    System.out.println(Player.getPlayer2().getName() + " nyert! Függőleges!");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonalWinner() {
        int[] lnyi = {0, 1, 2, 6, 7, 8, 12, 13, 14}; // LehetségesNyertesIndxek - csak innen indulhatnak a nyertes átlósok
        for (int i = 0; i < lnyi.length; i++) {
            int zs = lnyi[i];
            if (Grid.grid[zs].equals("X") &&
                    Grid.grid[zs + 7].equals("X") &&
                    Grid.grid[zs + 7 * 2].equals("X") &&
                    Grid.grid[zs + 7 * 3].equals("X")) {
                System.out.println(Player.getPlayer2().getName() + " nyert! Átlós!");
                return true;
            }
        }
        for (int i = 0; i < lnyi.length; i++) {
            int zs = lnyi[i];
            if (Grid.grid[zs].equals("O") &&
                    Grid.grid[zs + 7].equals("O") &&
                    Grid.grid[zs + 7 * 2].equals("O") &&
                    Grid.grid[zs + 7 * 3].equals("O")) {
                System.out.println(Player.getPlayer2().getName() + " nyert! Átlós!");
                return true;
            }
        }
        return false;
    }
}
// 0 1 2 3 4 5
// 6 7 8 9 10 11
//12 13 14 15 16 17
//        if (horizontal && (head % 6) + shipSize <= 6) { // vízszintes és el is fér
//            for (int i = 0; i < shipSize; i++) {
//                shipCells[i] = head++;
//            }
//
//        } else if (!horizontal && head + (shipSize - 1) * 6 < 36) { //függőleges és el is fér
//            for (int i = 0; i < shipSize; i++) {
//                shipCells[i] = head;
//                head += 6;
//            }
