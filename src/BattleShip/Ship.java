package BattleShip;

import java.util.Arrays;

public class Ship extends Grid{
    // kell egy 1 méretű hajó, elfoglalt indexekkel és player 2 hajó elfoglalt helyekkel. Ezekből 5-5.
    private int[] shipCells;
    private String shipOwner;
    private boolean horizontal;
    private boolean isSunk;

    public Ship(int[] shipCells, String shipOwner, boolean horizontal,boolean sunk) {
        System.out.println("Ship created: " + shipOwner + ", cells: " + Arrays.toString(shipCells));
        this.shipCells = shipCells;
        this.shipOwner = shipOwner;
        this.horizontal = horizontal;
        this.isSunk = sunk;
    }

    public int[] getShipCells() {
        return shipCells;
    }

    public int getShipSize() {
        return shipCells.length;
    }

    public String getShipOwner() {
        return shipOwner;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    //    private int[] p1Ship1;
//
//    public void setShipCells(int[] array) {
//        this.p1Ship1 = array;
//    }
//
//    public int[] getShipCells() {
//        return p1Ship1;
//    }







}
