package BattleShip2;

public class Player extends Grid{
    private String name;
    private String[] grid;
    private String[] ship;

    public void initPlayer1() {
        Player player1 = new Player();
        player1.setName("1. Játékos");
        String[] grid1 = new String[36];
        player1.setGrid(grid1);
        String[] ships1 = new String[5];
        player1.setShip(ships1);
        fillGridWithWater(player1.getGrid());
    }

    public String[] getShip() {
        return ship;
    }

    public void setShip(String[] ship) {
        this.ship = ship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGrid() {
        return grid;
    }

    public void setGrid(String[] grid) {
        this.grid = grid;
    }
}
