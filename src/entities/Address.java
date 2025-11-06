package entities;


/**
 * Represents a physical address.
 */
public class Address {

    private int addressId;
    private String street;
    private String city;
    private int zipCode;
    private String state;
    private int houseNumber;

    /**
     * Constructs an {@code Address} with the given parameters.
     *
     * @param addressId   Unique identifier for the address.
     * @param street      Street name of the address.
     * @param city        City where the address is located.
     * @param zipCode     ZIP or postal code.
     * @param state       State or region of the address.
     * @param houseNumber House number within the street.
     */
    public Address(int addressId, String street, String city, int zipCode, String state, int houseNumber) {
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
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
