package Objects;

public class Bird {
    private String name;
    private int wingCount;
    private int legCount;

    public int getWingCount() {
        return wingCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void chernobil(){
        legCount++;
        wingCount++;
    }
    public void itMovesLike(int a){
        for (int i=0; i<a; i++) {
            System.out.println("Flap, flap");
        }
    }
}
