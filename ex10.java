package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex10 {

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter width: ");
            double W = sc.nextDouble();

            System.out.print("Enter height: ");
            double H = sc.nextDouble();

            double A = calculateArea(W , H);

            System.out.println("Area = " + A);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        sc.close();
    }
}