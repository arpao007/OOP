package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 1; i <= 12; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}