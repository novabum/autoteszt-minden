package Objects;

public class Cat {
    private String name;
    private int legs = 4;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void speak() {
        System.out.println("Miáú. Miáú.");
    }



}



