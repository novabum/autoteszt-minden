package BattleShip;

import java.util.Scanner;

public class UserInteractionHandler {

    static Scanner in = new Scanner(System.in);

    public void rulesDialogue() {
        System.out.println("Üdvözlet a Thor Pedo játékban!");
        System.out.println("Először a sorok betűjét, majd az oszlop számát add meg. Pl. A1");
        System.out.println("Először az első játékos építi meg a hajóit, aztán a másik");
        System.out.println("Ha készen vagytok, indulhat a lövöldözés!");
        System.out.println("Kellemes időtöltést\n\n");
    }

    public static void makeAShipDialogue(int playerNumber, int shipSize) {
        if (shipSize == 1)
            System.out.println(playerNumber + ". játékos! add meg az 1-es méretú hajód helyzetét. Pl: 'A1'");
        else if (shipSize > 1) {
            System.out.println(playerNumber + ". játékos!");
            System.out.println(shipSize + " méretű hajód orientációja?");
            System.out.println("Függőleges: 1\nVízszintes: 2");
        }
    }

//    public static int selectAndToIndex() {
//        Scanner in = new Scanner(System.in);
//        return new int = Grid.selectionToIndex(in.next());
//    }

    //kiszámolja a megadott cella indexét
    public static int selectionToIndex() {
        while (true) {
            try {
                String input = (in.next()).toUpperCase();
                char rowLetter = input.charAt(0);
                int columnNumber = Integer.parseInt(Character.toString(input.charAt(1))) - 1; //na fasza NumberFormatException!!!

                if (rowLetter == 'A' || rowLetter == 'B' || rowLetter == 'C' || rowLetter == 'D' || rowLetter == 'E' || rowLetter == 'F' && columnNumber > 0 && columnNumber < 7) {
                    int rowNumber = 0;
                    switch (rowLetter) {
                        case 'A' -> rowNumber = 0;
                        case 'B' -> rowNumber = 1;
                        case 'C' -> rowNumber = 2;
                        case 'D' -> rowNumber = 3;
                        case 'E' -> rowNumber = 4;
                        case 'F' -> rowNumber = 5;
                    }
                    return rowNumber * 6 + columnNumber;
                } else {
                    throw new NullPointerException("A mező A1-F6 lehet.");
                }
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static boolean isYourShipHorizontal() {
        int shipOrientation;

        while (true) {
            try {
                shipOrientation = Integer.parseInt(in.next());
                if (shipOrientation == 1) {
                    return false; // Függőleges
                } else if (shipOrientation == 2) {
                    return true; // Vízszintes
                } else {
                    System.out.println("Érvénytelen! 1 asdasdvagy 2!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen!  1 vagy 2!");
            }


        }

    }
}