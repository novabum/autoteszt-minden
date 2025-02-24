package BattleShip;

import javax.swing.*;

public class BattleStep extends Ship {
    public BattleStep(String name, int[] shipCells, String shipOwner, boolean horizontal, boolean sunk) {
        super(name, shipCells, shipOwner, horizontal, sunk);
    }

    private static int n;

    //háború
    public static int commenceFire(int playerNumber, String[] enemyGrid) {
        System.out.println(playerNumber + ". játékos következik!\n");
        while (true) {
            int cellAttacked = Function.inputToIndex();
            try {
                return switch (enemyGrid[cellAttacked]) {
                    case "■", "X" -> throw new IllegalArgumentException("Ide már lőttél. Próbáld újra:");
                    case "□" -> {
                        System.out.print("TALÁLT!!! ");
                        yield cellAttacked;
                    }
                    default -> {
                        System.out.println("Nem talált");
                        yield cellAttacked;
                    }
                };
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //eltároljuk, megnézzük, süllyedt-e. Ha igen, kiírjük!
//Hajó[0,1,2,3,4,5] enemyShip-ét kell összehasonlítani összes shotcells-el
//külön kell bemenni a hajókba, hogy csak egyszer írja ki, hogy SUNK
    public static void DamageReport(Ship[] enemyShip, String[] enemyGrid) {
        for (int i = 0; i < 5; i++) {
            if (!enemyShip[i].isSunk()) {
                boolean allCellsHit = true;
                for (int j = 0; j < enemyShip[i].getShipCells().length; j++) {
                    if (!enemyGrid[enemyShip[i].getShipCells()[j]].equals("■")) {
                        allCellsHit = false;
                        break;
                    }
                }
                if (allCellsHit) {
                    System.out.print("és SÜLLYEDT");
                    enemyShip[i].setSunk(true);
                }
            }// ezt mire megszültem
        }
    }

    public static boolean allShipsDestroyed(int player, Ship[] enemyShip) {
        if (enemyShip[0].isSunk() && enemyShip[1].isSunk() && enemyShip[2].isSunk() && enemyShip[3].isSunk() && enemyShip[4].isSunk()) {
            System.out.println("\nVége a játéknak! " + player + ". játékos minden hajója elsüllyedt.");
            return true;
        }
        return false;
    }

}

//       System.out.println(enemyShip[0]);
// Csak a cellák, a könnyebb feldolgozás végett


//        int[] p2ship1 = (enemyShip[0].getShipCells());
//        int[] p2ship2 = (enemyShip[1].getShipCells());
//        int[] p2ship3 = (enemyShip[2].getShipCells());
//        int[] p2ship4 = (enemyShip[3].getShipCells());
//        int[] p2ship5 = (enemyShip[4].getShipCells());
//nem használtam végül, mert nem lehet dinamikusan módosítani a változók nevét
//a ciklusban

//        //első hajó
//        if (!enemyShip[0].isSunk() && enemyGrid[p2ship1[0]].equals("☒")) {
//            System.out.print(" és SÜLLYEDT");
//            enemyShip[0].setSunk(true);
//        }


//
//                if (enemyGrid[p2ship1[0]].equals("☒");
//
//            }        }


//
//        boolean atTheBottom = false;
//
/// /      !!!!!!!!!!!         cellsShotArray[x+1 edik eleme ahányszor lefut az egyenlő a cellattack-edel];
//
//        for(
//    int i = 0;
//    i<allShipCells;i++)
//
//    {
//
//    }
//}
//
//public static boolean allShipsDestroyed() {


//eltaltálta valamelyik hajót?
//        boolean didItHurt = false;
//        int allShipCells = 1 + 2 + 3 + 4 + 5;
//        for (int i = 0; i < allShipCells; i++) {
//            if (enemyGrid[0].equals("□")) {
//                System.out.println("Talált");
//            } else {
//                System.out.println("Nem talált");
//            }
//            if (i == 0) {
//                didItHurt = enemyShipArray[0] == enemyShipArray[cellAttacked];


//        if(!didItHurt)System.out.println("Nem talált");
//
//
//    private static boolean ship1Hit(Ship[] enemyShipArray, int cellAttacked) {
//        //elsó hajó
//        return enemyShipArray[0] == enemyShipArray[cellAttacked];
//    }
//}

//    }
//            }
//    player1Ship[0]
//    player1Ship[1]
//    player1Ship[2]
//    player1Ship[3]
//    player1Ship[4]
//
//    player2Ship[0]
//    player2Ship[1]
//    player2Ship[2]
//    player2Ship[3]
//    player2Ship[4]

