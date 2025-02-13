package BattleShip;


public class Player extends Ship {
    public Player(String name, int[] shipCells, String shipOwner, boolean horizontal, boolean sunk) {
        super(name, shipCells, shipOwner, horizontal, sunk);
    }

    public static void shipCreator(int player, String[] currentGrid, Ship[] playerShips) {
        for (int shipSizeToCreate = 1; shipSizeToCreate < 6; shipSizeToCreate++) {
            boolean isItHorizontal = false;
            UserInteractionHandler.makeAShipDialogue(player, shipSizeToCreate);
            if (shipSizeToCreate > 1) {
                isItHorizontal = UserInteractionHandler.isYourShipHorizontal();
            }
//            int selectedHead = UserInteractionHandler.selectionToIndex(); //Stringet validáljuk, átalakítjuk indexé
            int[] shipCells = Grid.buildShipCells(shipSizeToCreate, isItHorizontal, currentGrid);
            String shipName = "p" + player + "Ship" + shipSizeToCreate; //elnevezem, de minek?
            Ship currentShip = new Ship(
                    shipName,
                    shipCells,
                    "Player " + player,
                    isItHorizontal,
                    false
            );
            playerShips[shipSizeToCreate - 1] = currentShip; // beledobjuk a megfelelő arraybe. nagyon cigány módszer, ez van
//            System.out.println(Arrays.toString(shipCells)); //ellenőrzés
            Grid.drawShipOnGrid(currentShip.getShipCells(), currentGrid);
            Grid.printGrid(currentGrid);
        }
    }


    public static void atWar(int playerNumber, String[] enemyGrid, Ship[] enemyShipArray) {
        System.out.println(playerNumber + " játékos támad!");
        int cellAttacked = UserInteractionHandler.selectionToIndex();
        if (enemyGrid[cellAttacked].equals("☒")){
            throw new IllegalArgumentException("Ide már lőttél, cowboy");
        }
        //eltaltálta valamelyik hajót?
        boolean didItHurt = false;
        int allShipCells = 1 + 2 + 3 + 4 + 5;
        for (int i = 0; i < allShipCells; i++) {
            enemyShipArray[0]
//            if (i == 0) {
//                didItHurt = enemyShipArray[0] == enemyShipArray[cellAttacked];


            }

        }
    }
        if(!didItHurt)System.out.println("Nem talált");


    private static boolean ship1Hit(Ship[] enemyShipArray, int cellAttacked) {
        //elsó hajó
        return enemyShipArray[0] == enemyShipArray[cellAttacked];
    }
}

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

