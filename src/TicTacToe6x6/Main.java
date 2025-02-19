package TicTacToe6x6;


public class Main {
    public static void main(String[] args) {
        Player.askForNames();
        Grid.fillGrid();
        Grid.printGrid();

        while (true) {
            System.out.println(Player.getPlayer1().getName() + "! Hova teszel 'X'-et? (A1-F6)");
            Grid.player1XOnGrid();
            Grid.printGrid();
            if (Grid.checkHorizontalWinner()) return;
            if (Grid.checkVerticalWinner()) return;
            if (Grid.checkDiagonalWinner()) return;
            System.out.println(Player.getPlayer2().getName() + "! Hova teszel 'O'-t? (A1-F6)");
            Grid.player2OOnGrid();
            Grid.printGrid();
            if (Grid.checkHorizontalWinner()) return;
            if (Grid.checkVerticalWinner()) return;
            if (Grid.checkDiagonalWinner()) return;
        }
    }
}
