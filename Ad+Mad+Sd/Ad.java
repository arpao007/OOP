package Op3;

public class Ad {
    String street;
    String city;
    String zipCode;

    public Ad(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}