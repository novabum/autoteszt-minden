package BattleShip2;

public class GameHandler {
    public void startGame() {
        //A játékosoknak lesznek pályái és hajói
        //Elkészítjük a játékosokat, pályákkal, névvel, hajókkal.
        UserInteractionHandler.rulesDialogue();
        Player player1 = new Player("1. Játékos");
        Player player2 = new Player("2. Játékos");
        player1.buildShips();
        player2.buildShips();

        //Addig megy a játék, amíg életben vagyunk
        //a kör játékosváltással folytatódik
        while (player1.isStillAlive() || player2.isStillAlive()) {
            playTurn(player1, player2);
            if (player2.isStillAlive()) playTurn(player2, player1);
        }

    }

    //Talált vagy sem? Elsüllyed-e? és pálya print.
    private void playTurn(Player attacker, Player defender) {
        attacker.commenceFire(defender);
        defender.DamageReport();
        attacker.printPlayerGrid();
    }
}