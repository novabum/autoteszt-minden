package BattleShip;

import java.util.Scanner;

public class MainBattleShip {
    public static void main(String[] args) {
//    5 hajó lesz benne, konzolban menjen 6x6-os táblán megy a játék.
//    1, 2, 3, 4, 5-ös méretben
        // szabályok ismertetése stb. első felhasználó elhelyezi a hajóit, aztán a másik. Egyik user lő, másik lő
        // találat, süllyedés jelzése. Minden lövés után ki kell rajzolni azt a táblát, amelyet látunk a másikéból.
        // ismeretlen: - üres: 0 talált X
        // ha mindegyik hajó elsüllyedt vége a játéknak
        //nem állhat le a program
        // határidő március 2. hete

        String[] grid1 = new String[36];
        String[] grid2 = new String[36];
        Grid.resetGrids(grid1, grid2);
        Grid.printGrid(grid1);
        UserInteractionHandler.greetUser();
        Scanner in = new Scanner(System.in);
        int[] selection = {Grid.selectionToIndex(in.next())}; //bekérjük és konvertáljuk a hajó indexét int arraybe
        Ship player1Ship1 = new Ship();
        player1Ship1.setShipPosition(selection);
        Grid.drawShipOnGrid(player1Ship1.getShipPosition(), grid1); //felrajzoljuk a táblára
        Grid.printGrid(grid1);

        System.out.println("Függőleges vagy vízszintes legyen a 2-es méretű hajód?");
        System.out.println("Függőleges: 1. Vízszintes: 2");
        int shipOrientation = in.nextInt();
        System.out.println("Add meg a kezdőpontját."+ "\n" + "(Balról jobbra, fentről lefelé rajzoljuk fel)");
        //ez egy index, a hajó feje, orientációval együtt feldolgozzuk és felrajzoljuk
        int shipHead = Grid.selectionToIndex(in.next());
        //a kezdőpontot és a kiterjedést is validálni kell!




//        System.out.println(Arrays.toString(Ship.getShip(player1Ship1));








    }
}
