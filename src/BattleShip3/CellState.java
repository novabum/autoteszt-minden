package BattleShip3;

public enum CellState {
    EMPTY("~"), SHIP("■"), HIT("☒"), MISS("○");

    private final String symbol;
    CellState(String symbol) { this.symbol = symbol; }
    public String toString() { return symbol; }
}