package Immutable;

public class Name {
    private String firstName;
    private String lastName;

    //rendes constructor
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //overloaded copy constructor
    public Name(Name otherName){
        this.firstName = otherName.firstName;
        this.lastName = otherName.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
