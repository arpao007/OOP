package Op5;

import java.util.Scanner;

public class Mc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        	System.out.print("Car brand name and model :" );
            String model = sc.nextLine();
            System.out.print("Year of manufacture :" );
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("Newly updated year :" );
            int newYear = Integer.parseInt(sc.nextLine());

            Car car = new Car(model, year);
            car.setYear(newYear);

            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
