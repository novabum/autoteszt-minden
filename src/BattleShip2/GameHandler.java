package BattleShip2;

import BattleShip3.UserInteractionHandler;
import TicTacToe6x6.Grid;

public class GameHandler {
    public static void main(String[] args) {
        //A játékosoknak lesznek pályái és hajói
        //Elkészítjük a játékosokat, pályákkal, névvel, hajókkal.
        Player player1 = new Player("1. Játékos");
        Player player2 = new Player("2. Játékos");
        player1.buildShips();
        player2.buildShips();


//        while (!player2.allShipsDestroyed() || player1.allShipsDestroyed()) {
//            playTurn(player1, player2);
//            if (!player1.allShipsDestroyed()) playTurn(player2, player1);
//        }
//
//    private void playTurn(Player attacker, Player defender) {
//        System.out.println(attacker.getName() + ", it's your turn to shoot!");
//        int target = UserInteractionHandler.getShot();
//        boolean hit = defender.processShot(target);
//        System.out.println(hit ? "Hit!" : "Miss!");
    }
}

//
//        Grid.fillGridsWithWater(p1grid, p2grid);
//        UserInteractionHandler.rulesDialogue();
//        //hajókreálás
//        Grid.printGrid(p1grid);
//        Ship.shipCreator(1, p1grid, p1ShipsArray);
//        Grid.printGrid(p2grid);
//        Ship.shipCreator(2, p2grid, p2ShipsArray);
//
//        //harc
//        int p1ShootsOn;
//        int p2ShootsOn;
//        while (true) {
//            /* player1 phase */
//            System.out.println("\n2. játékos táblája");
//            Grid.printGrid(p1grid);
//            p1ShootsOn = (BattleStep.commenceFire(1, p2grid)); //lő és talált?
//            Grid.drawXOnGrid(p1ShootsOn, p2grid);
//            BattleStep.DamageReport(p2ShipsArray, p2grid); //süllyedt?
//            if (BattleStep.allShipsDestroyed(2, p2ShipsArray)){
//             return;
//            }
//            /* player 2 phase */
//            System.out.println("\n2. játékos táblája");
//            Grid.printGrid(p2grid);
//            p2ShootsOn = (BattleStep.commenceFire(2, p1grid)); //lő és talált?
//            Grid.drawXOnGrid(p2ShootsOn, p1grid);
//            BattleStep.DamageReport(p1ShipsArray, p1grid); //süllyedt?
//            if (BattleStep.allShipsDestroyed(1, p1ShipsArray)){
//                return;
//            }
//        }
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


