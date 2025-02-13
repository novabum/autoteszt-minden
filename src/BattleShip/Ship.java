package BattleShip;

import java.util.Arrays;
import java.util.Scanner;

public class Ship extends Grid {
    // kell egy 1 méretű hajó, elfoglalt indexekkel és player 2 hajó elfoglalt helyekkel. Ezekből 5-5.
    private String name;
    private int[] shipCells;
    private String shipOwner;
    private boolean horizontal;
    private boolean isSunk;

    public Ship(String name, int[] shipCells, String shipOwner, boolean horizontal, boolean sunk) {
        System.out.println(shipOwner + Arrays.toString(shipCells) + isSunk); //ellenőrzés
        this.name = name;
        this.shipCells = shipCells;
        this.shipOwner = shipOwner;
        this.horizontal = horizontal;
        this.isSunk = sunk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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



