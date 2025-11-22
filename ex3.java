package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        sc.close();
    }
}