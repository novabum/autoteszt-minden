package Immutable;

public class Address {
    private String country;
    private String city;
    private String zip;
    private String addressLine1;
    private String addressLine2;

    public Address(String country, String city, String zip, String addressLine1, String addressLine2) {
        this.country = country;
        this.city = city;
        this.zip = zip;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    //overloaded copy constructor
    public Address(Address otherAddress) {
        this.country = otherAddress.country;
        this.city = otherAddress.city;
        this.zip = otherAddress.zip;
        this.addressLine1 = otherAddress.addressLine1;
        this.addressLine2 = otherAddress.addressLine2;
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
