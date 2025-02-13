package BattleShip;

public class MainBattleShip {
    public static void main(String[] args) {
//    5 hajó lesz benne, konzolban menjen 6x6-os táblán megy a játék.
//    1, 2, 3, 4, 5-ös méretben
        // szabályok ismertetése stb. első felhasználó elhelyezi a hajóit, aztán a másik. Egyik user lő, másik lő
        // találat, süllyedés jelzése. Minden lövés után ki kell rajzolni azt a táblát, amelyet látunk a másikéból.
        // ismeretlen: - üres: 0 talált X
        // ha mindegyik hajó elsüllyedt vége a játéknak
        // nem állhat le a program
        // határidő március 2. hete

        String[] grid1 = new String[36];
        String[] grid2 = new String[36];

        Ship[] player1Ship = new Ship[5]; //Arrayekben tároljuk a hajókat, mert a constructorban nem módosítható a név dinamikusan
        Ship[] player2Ship = new Ship[5];

        Grid.resetGrids(grid1, grid2);
        Grid.printGrid(grid1);
//lehetne egy szabályok tájékoztató
        Player.shipCreator(1, grid1, player1Ship);
        Player.atWar(1,grid2,player2Ship);
        Grid.printGrid(grid2);
        Player.shipCreator(2, grid2, player2Ship);


//        System.out.println(Arrays.toString(player1Ship)); //Ellenőrzés,
//        System.out.println(Arrays.toString(player2Ship));
//        System.out.println(player1Ship[0].getName());

//        boolean isThisTheEnd = false;
//        while (!isThisTheEnd)
//
//        {
//            Player.atWar(1, grid2);
//            Player.atWar(1, grid2);
//            isThisTheEnd = true; //ide kell egy method
//        }
    }
}

    // ****************************************** //










//        System.out.println(Arrays.toString(Ship.getShip(player1Ship1));

