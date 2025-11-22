package Op;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of integers : ");
            int N = sc.nextInt();

            if (N <= 0) {
                System.out.println("Error: N must be a positive integer.");
            } else {
                int sum = 0;

                for (int i = 1; i <= N; i++) {
                    System.out.print("Enter number " + i + ": ");
                    int num = sc.nextInt();
                    sum += num;
                }

                System.out.println("Sum = " + sum);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}