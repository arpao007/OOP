package Op4;

public class Sc {
    Pd[] items = new Pd[10];
    int itemCount = 0;

    public void addProduct(Pd p) {
        if (itemCount < 10) {
            items[itemCount] = p;
            itemCount++;
        }
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].price;
        }
        return sum;
    }
}