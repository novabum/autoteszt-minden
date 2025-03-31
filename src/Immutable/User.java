package Immutable;

import java.util.ArrayList;
import java.util.List;

public final class User {
    private final Name username;
    private final Address addr;
    private List<String> something = new ArrayList<>();

    public User(Name name,  Address addr, List<String> something) {
        this.username = new Name(name);
        this.addr = new Address(addr);
        this.something = new ArrayList<>(something);
    }

    public Name getName() {
        Name nameCopy = new Name(this.username);
        return nameCopy;
    }

    public Address getAddr() {
        Address copyOfAddress = new Address(this.addr);
        return copyOfAddress;
    }

    public List<String> getSomething() {
        List<String> copyOfString = new ArrayList<>(this.something);
        return copyOfString;
    }
}
