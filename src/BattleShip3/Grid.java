package BattleShip3;

public class Grid {
    private String[] board;

    public Grid() {
        board = new String[36];
        for (int i = 0; i < board.length; i++) board[i] = "~"; // Empty water
    }

    public void placeShip(int[] cells) {
        for (int cell : cells) board[cell] = "■"; // Ship marker
    }

    public void markMiss(int cell) {
        board[cell] = "○"; // Miss marker
    }

    public void printGrid() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 6 == 0) System.out.println();
        }
    }
}

