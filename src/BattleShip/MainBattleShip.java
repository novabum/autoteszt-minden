package BattleShip;

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
        Grid.resetGrid(grid1);
        Grid.printGrid(grid1);




    }
}
