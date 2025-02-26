package BattleShip2;

public class Ship {

    private int[] shipCells;
    private boolean horizontal;
    private boolean isSunk;

    public Ship(int[] shipCells) {
        this.shipCells = shipCells;
    }

    public int[] getShipCells() {
        return shipCells;
    }

    public int getShipSize() {
        return shipCells.length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = true;
    }
}
