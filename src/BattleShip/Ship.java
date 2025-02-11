package BattleShip;

public class Ship {
    // kell egy 1 méretű hajó, elfoglalt indexekkel és player 2 hajó elfoglalt helyekkel. Ezekből 5-5.

    private int[] p1Ship1;

    public void setShipPosition(int[] array) {
        this.p1Ship1 = array;
    }

    public int[] getShipPosition() {
        return p1Ship1;
    }
}
