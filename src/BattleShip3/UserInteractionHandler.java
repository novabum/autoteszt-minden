package BattleShip3;

import java.util.Scanner;

public class UserInteractionHandler {
    private static Scanner in = new Scanner(System.in);

    public static int[] getShipPlacement(int size) {
        System.out.println("Enter the starting position (A1-F6) for ship of size " + size + ":");
        int head = inputToIndex();
        boolean horizontal = getOrientation();

        int[] shipCells = new int[size];
        for (int i = 0; i < size; i++) {
            shipCells[i] = horizontal ? head + i : head + (i * 6);
        }
        return shipCells;
    }

    public static boolean getOrientation() {
        System.out.println("Enter 1 for vertical, 2 for horizontal:");
        return in.nextInt() == 2;
    }

    public static int getShot() {
        System.out.println("Enter the position to shoot (A1-F6):");
        return inputToIndex();
    }

    public static int inputToIndex() {
        String input = in.next().toUpperCase();
        char rowLetter = input.charAt(0);
        int columnNumber = Character.getNumericValue(input.charAt(1)) - 1;
        int rowNumber = rowLetter - 'A';
        return rowNumber * 6 + columnNumber;
    }
}