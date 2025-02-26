package BattleShip2;

import java.util.Scanner;

public class UserInteractionHandler {

    public static Scanner in = new Scanner(System.in);

    public static void rulesDialogue() {
        System.out.println("Üdvözlet a 'Thor 1 Pedó' játékban!");
        System.out.println("Először a sorok betűjét, majd az oszlop számát add meg. Pl. A1");
        System.out.println("Az első játékos építi meg a hajóit először, aztán a másik");
        System.out.println("Ha kész, indulhat a lövöldözés!");
        System.out.println("Kellemes időtöltést\n\n");
    }

    public static void makeAShipDialogue(String playername, int shipSize) {
        if (shipSize == 1)
            System.out.println(playername + "! add meg az 1-es méretú hajód helyzetét. Pl: 'A1'");
        else if (shipSize > 1) {
            System.out.println(playername + "!");
            System.out.println(shipSize + " méretű hajód mi legyen?");
            System.out.println("függőleges: 1\nvízszintes: 2");
        }
    }

//    public static int selectAndToIndex() {
//        Scanner in = new Scanner(System.in);
//        return new int = Grid.selectionToIndex(in.next());
//    }

}