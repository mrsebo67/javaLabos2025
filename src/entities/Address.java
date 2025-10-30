package entities;

public class Address {

    private int addressId;
    private String street;
    private String city;
    private String zipCode;
    private String state;
    private int houseNumber;


    public Address(int addressId, String street, String city, String zipCode, String state, int houseNumber) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.houseNumber = houseNumber;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
