package BattleShip2;

public class Ship {

    private int[] shipCells;
    private boolean isSunk;

    public Ship(int[] shipCells) {
        this.shipCells = shipCells;
    }

    public int[] getShipCells() {
        return shipCells;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = true;
    }

}
