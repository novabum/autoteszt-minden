package BattleShip3;

public class Ship {
    private int[] cells;
    private boolean[] hits;

    public Ship(int[] cells) {
        this.cells = cells;
        this.hits = new boolean[cells.length];
    }

    public boolean hit(int target) {
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == target) {
                hits[i] = true;
                return true;
            }
        }
        return false;
    }

    public boolean isSunk() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }
}
