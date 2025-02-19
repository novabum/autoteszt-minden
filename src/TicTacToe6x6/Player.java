package TicTacToe6x6;

public class Player extends Function {
    private String name;
    static Player player1 = new Player();
    static Player player2 = new Player();


    public static Player getPlayer1() {
        return player1;
    }

    public static void setPlayer1(Player player1) {
        Player.player1 = player1;
    }

    public static Player getPlayer2() {
        return player2;
    }

    public static void setPlayer2(Player player2) {
        Player.player2 = player2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

