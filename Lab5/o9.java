package Op8;

import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class o9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String physicalName = sc.nextLine();
        double unitPrice = Double.parseDouble(sc.nextLine());
        int quantity = Integer.parseInt(sc.nextLine());

        String digitalName = sc.nextLine();
        double monthlyCost = Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());

        Item p = new PhysicalProduct(physicalName, unitPrice, quantity);
        Item d = new DigitalSubscription(digitalName, monthlyCost, months);

        Item[] items = { p, d };

        double total = 0.0;
        for (Item i : items) {
            total += i.getValue();
        }

        System.out.println(total);

        sc.close();
    }
}
