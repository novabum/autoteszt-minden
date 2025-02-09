package Objects;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Cirmi");
        System.out.println(cat1.getName());
        cat1.speak();
    }
}
