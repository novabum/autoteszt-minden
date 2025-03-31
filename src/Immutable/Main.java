package Immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address addr1 = new Address("Hungary", "Mezotur", "5400", "Pulz u", "12/a");
        Address addr2 = new Address("Hungary", "Budapest", "1234", "Attila u", "14/b");
        var name1 = new Name("Nagy", "Sámson");
        var name2 = new Name("Kiss", "Behemót");
        List<String> something1 = new ArrayList<>();
        something1.add("Séta");
        something1.add("Cica");
        something1.add("Kutya");

        var user1 = new User(name1, addr1, something1);

        System.out.println("Tesztek:\n");
        addr1.setCity("KissNagyKözepesFalva");
        System.out.println("Nem változik:");
        System.out.println(user1.getAddr().getCity());
        System.out.println("\n\nVáltozott:");
        System.out.println(addr1.getCity());

        user1.getAddr().setCity("NyuggerFalva"); // hiába változtatom, csak egy másolattal szórakozhatom.
        System.out.println("\nNem változik:");
        System.out.println(user1.getAddr().getCity());


    }
}
