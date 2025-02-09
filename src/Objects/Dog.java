package Objects;


public class Dog {

    private int legs = 4;


    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void amputatedLeg(){
        legs--;
    }
}
