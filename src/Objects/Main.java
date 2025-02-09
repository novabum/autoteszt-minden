package Objects;

public class Main {
    public static void main(String[] args) {

        Calculator szamologep = new Calculator();

//        int a = szamologep.sum(3, 6);
//        int b = szamologep.substract(6, 4);


//        Dog zsemle = new Dog();
//        zsemle.setName("Zsemle");
//
//        Dog frakk = new Dog();
//        frakk.setName("Frakk");
//
//        System.out.println(zsemle.getName());
//        System.out.println(zsemle.getLegs());
//        zsemle.amputatedLeg();
//        System.out.println(zsemle.getLegs());
//        System.out.println(frakk.getName());
//        System.out.println(frakk.getLegs());
//        System.out.println(frakk.getClass());
//
//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        dog1.setName("Morzsi");
//        dog2.setName("Morzsi");
//
//        System.out.println(dog1 == dog2); //false
//        System.out.println(dog1);
//        System.out.println(dog2);

        int a = 5;
        int b = a;
        a = 7;
        System.out.println(b);

        Dog abc1 = new Dog();
        Dog abc2 = new Dog();
        abc1.setName("qwertz");
        abc2 = abc1;
        abc1.setName("yxccv");
        System.out.println(abc2.getName());

//        int myInt = 6;
//
//
//
//
//
//    }
//    private static void addOne ( int a){
//        a++;
//    }
//    private static void changeName(Dog dog);

}
}
