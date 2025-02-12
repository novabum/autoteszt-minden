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

//player 1 creates ship 1
        UserInteractionHandler.makeAShipDialogue(1,1);
int[] selectedCell = UserInteractionHandler.selectAndToIndex();//bekérjük és konvertáljuk a hajó indexét int arraybe
//        System.out.println(Arrays.toString(selection));
        Ship p1Ship1 = new Ship(
                selectedCell,
                "Player1",
                false,
                false);

        Grid.drawShipOnGrid(p1Ship1.getShipCells(), grid1, 1, 0); //felrajzoljuk a táblára
        Grid.printGrid(grid1);

        //player 1 creates ship 2
UserInteractionHandler.makeAShipDialogue(1,2);
boolean isItHorizontal = UserInteractionHandler.isYourShipHorizontal();//ide kell egy orientáció in. ami boolean-t ad vissza és lehet konstruktálni a 2. hajót.
selectedCell = UserInteractionHandler.selectAndToIndex();//ez egy index, a hajó feje, orientációval együtt feldolgozzuk és felrajzoljuk
        Ship p1Ship2 = new Ship(
                selectedCell,
                "Player1",
                isItHorizontal,
                false);
        //a kezdőpontot és a kiterjedést is validálni kell!
        //ezután felrajzolható a táblára.


//        System.out.println(Arrays.toString(Ship.getShip(player1Ship1));

    }
}

