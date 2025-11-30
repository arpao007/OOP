package Op3;

public class Sd {
    String name;
    Ad address;

    public Sd(String name, Ad address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}