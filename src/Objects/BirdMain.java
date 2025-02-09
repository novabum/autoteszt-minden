package Objects;

public class BirdMain {
    public static void main(String[] args) {
        Bird birdie = new Bird();
        birdie.setName("Nyafi");
        birdie.setLegCount(2);
        birdie.setWingCount(2);
        birdie.chernobil();

        System.out.println(birdie.getName() +" "+ birdie.getLegCount() +" "+ birdie.getWingCount());

    }
}
