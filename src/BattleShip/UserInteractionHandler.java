package BattleShip;

import java.util.Scanner;

public class UserInteractionHandler {

    public static void makeAShipDialogue(int playerNumber, int shipSize) {
        if (shipSize == 1)
            System.out.println(playerNumber + ". játékos! add meg az 1-es méretú hajód helyzetét. Pl: 'A1'");
        else if (shipSize > 1) {
            System.out.println(playerNumber + ". játékos!");
            System.out.println(shipSize + "méretű hajód orientációja?");
            System.out.println("Függőleges: 1. Vízszintes: 2");
        }
    }

    public static int[] selectAndToIndex() {
        Scanner in = new Scanner(System.in);
        return new int[]{Grid.selectionToIndex(in.next())};
    }

    public static void addShipHead() {
        System.out.println("Add meg a kezdőpontját." + "\n" + "(Balról jobbra, fentről lefelé rajzoljuk fel)");
        Scanner in = new Scanner(System.in);
        int shipHead = Grid.selectionToIndex(in.next());
    }

    public static boolean isYourShipHorizontal() {
        Scanner in = new Scanner(System.in);
        int shipOrientation = in.nextInt();
        if (shipOrientation == 1)
            return false;
        else return (shipOrientation == 2);
    }


}

