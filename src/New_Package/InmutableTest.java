package New_Package;

import java.util.ArrayList;
import java.util.List;

public class InmutableTest {

    private final String name;

    private final List<Address> list;


    public InmutableTest(String name, List<Address> list) {
        this.name = name;
        this.list = List.copyOf(list); //Nem engedi változtatni a tartalmat
    }

    private List<Address> deepCopyADdresses(List<Address> addresses){
        List<Address> copy = new ArrayList<>();
        for (Address address: addresses){
            Address newAddress = new Address();
            newAddress-deepCopyAddressLine1(address.getAddressLine1());
            newAddress-deepCopyAddressLine2(address.getAddressLine2());
            copy.add(new Address());
        }
        return copy;
    }

    public void printList() {
        System.out.println(list);
    }

}
