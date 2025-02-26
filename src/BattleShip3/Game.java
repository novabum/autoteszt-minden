package BattleShip3;

public class Game {
    private Player player1;
    private Player player2;

    public void startGame() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");

        player1.placeShips();
        player2.placeShips();

        while (!player1.hasLost() && !player2.hasLost()) {
            playTurn(player1, player2);
            if (!player2.hasLost()) playTurn(player2, player1);
        }

        System.out.println("Game over! Winner: " + (player1.hasLost() ? player2.getName() : player1.getName()));
    }

    private void playTurn(Player attacker, Player defender) {
        System.out.println(attacker.getName() + ", it's your turn to shoot!");
        int target = UserInteractionHandler.getShot();
        boolean hit = defender.processShot(target);
        System.out.println(hit ? "Hit!" : "Miss!");
    }
}