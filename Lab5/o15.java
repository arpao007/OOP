package Op8;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class C extends RentalVehicle {
    public C(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class o15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carModel = sc.nextLine();
        double carRate = Double.parseDouble(sc.nextLine());

        String motoModel = sc.nextLine();
        double motoRate = Double.parseDouble(sc.nextLine());

        C car = new C(carModel, carRate);
        Motorcycle motorcycle = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = {car, motorcycle};

        double totalFee = 0.0;
        for (RentalVehicle v : vehicles) {
            totalFee += v.calculateFee();
        }

        System.out.println(totalFee);

        sc.close();
    }
}
