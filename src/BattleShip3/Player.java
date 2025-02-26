package BattleShip3;

public class Player {
    private String name;
    private Grid grid;
    private Ship[] ships;

    public Player(String name) {
        this.name = name;
        this.grid = new Grid();
        this.ships = new Ship[5]; // 5 ships with different sizes
    }

    public void placeShips() {
        for (int size = 1; size <= 5; size++) {
            System.out.println(name + ", place your ship of size " + size);
            int[] shipCells = UserInteractionHandler.getShipPlacement(size);
            ships[size - 1] = new Ship(shipCells);
            grid.placeShip(shipCells);
        }
    }

    public boolean processShot(int target) {
        for (Ship ship : ships) {
            if (ship.hit(target)) {
                if (ship.isSunk()) System.out.println("A ship has sunk!");
                return true;
            }
        }
        grid.markMiss(target);
        return false;
    }

    public boolean hasLost() {
        for (Ship ship : ships) {
            if (!ship.isSunk()) return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }
}
