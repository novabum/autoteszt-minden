package BattleShip;

public class MainBattleShip {
    public static void main(String[] args) {
/*
    5 hajó lesz benne, konzolban menjen 6x6-os táblán megy a játék.
    1, 2, 3, 4, 5-ös méretben
 szabályok ismertetése stb. első felhasználó elhelyezi a hajóit, aztán a másik. Egyik user lő, másik lő
 találat, süllyedés jelzése. Minden lövés után ki kell rajzolni azt a táblát, amelyet látunk a másikéból.
 ismeretlen: - üres: 0 talált X
 ha mindegyik hajó elsüllyedt vége a játéknak
 nem állhat le a program
 határidő március 2. hete
*/
        String[] p1grid = new String[36];
        String[] p2grid = new String[36];

        Ship[] p1ShipsArray = new Ship[5]; //Arrayekben tároljuk a hajókat, mert a constructorban nem módosítható a név dinamikusan
        Ship[] p2ShipsArray = new Ship[5];

        Grid.fillGridsWithWater(p1grid, p2grid);
        UserInteractionHandler.rulesDialogue();
        //hajókreálás
        Grid.printGrid(p1grid);
        Ship.shipCreator(1, p1grid, p1ShipsArray);
        Grid.printGrid(p2grid);
        Ship.shipCreator(2, p2grid, p2ShipsArray);

        //harc
        boolean theGameIsOn = true;
        int p1ShootsOn;
        int p2ShootsOn;

        int[] p1CellShotsArray = new int[36]; //ha nagyon béna lenne, ennyi lövése lenne
        int[] p2CellShotsArray = new int[36];
        while (true) {


            //player1 phase
            System.out.println("\n2. játékos táblája");
            Grid.printGrid(p1grid);
            p1ShootsOn = (BattleStep.commenceFire(1, p2grid)); //lő és talált?
            Grid.drawXOnGrid(p1ShootsOn, p2grid);
            BattleStep.DamageReport(p2ShipsArray, p2grid); //süllyedt?
            if (BattleStep.allShipsDestroyed(2, p2ShipsArray)){
             return;
            }
            //player 2 phase
            System.out.println("\n2. játékos táblája");
            Grid.printGrid(p2grid);
            p2ShootsOn = (BattleStep.commenceFire(2, p1grid)); //lő és talált?
            Grid.drawXOnGrid(p2ShootsOn, p1grid);
            BattleStep.DamageReport(p1ShipsArray, p1grid); //süllyedt?
            if (BattleStep.allShipsDestroyed(1, p1ShipsArray)){
                return;
            }
        }
    }
}
//        int numberOfp1Shots = 0; // nem kell mert a táblázat tárolja
//        int numberOfp2Shots = 0;
//            p1CellShotsArray[numberOfp1Shots] = p1ShootsOn;
//            numberOfp1Shots++;
//        System.out.println(Arrays.toString(p1ShipsArray)); //Ellenőrzés,
//        System.out.println(Arrays.toString(p2ShipsArray));
//        System.out.println(p1ShipsArray[0].getName());

//        boolean isThisTheEnd = false;
//        while (!isThisTheEnd)
//
//        {
//            Player.commenceFire(1, grid2);
//            Player.commenceFire(1, grid2);
//            isThisTheEnd = true; //ide kell egy method
//        }


// ****************************************** //


//        System.out.println(Arrays.toString(Ship.getShip(player1Ship1));

