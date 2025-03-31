package New_Package;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Address> list = new ArrayList<>();
        list.add("Teszt");
//        TestList testList = new TestList(list);
//        testList.doStuff();
//
//        System.out.println(list);

        InmutableTest test = new InmutableTest("asd", list);
        test.printList();
        list.add("casfdas");
        test.printList();
        System.out.println(list); // list módosult, de az inmutable nem






//        TestClass testClass = new TestClass();
//        testClass.setName("Teszt név");
//        TestClassPirate.beAJerk(testClass);
//
//        System.out.println(testClass.getName());
    }
}
