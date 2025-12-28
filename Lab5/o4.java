package Op8;

import java.util.Scanner;

class Vehicle {

    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {

    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

public class o4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputColor = sc.nextLine();
        int inputWheels = sc.nextInt();

        Car car = new Car(inputColor, inputWheels);

        car.displayDetails();

        sc.close();
    }
}
