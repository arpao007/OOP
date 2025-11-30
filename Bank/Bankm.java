package op2;

import java.util.Scanner;

public class Bankm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	System.out.print("Enter your name :");
            String owner = sc.nextLine();
            System.out.print("Enter your initial :");
            double initial = sc.nextDouble();
            System.out.print("Enter your amount :");
            double amount = sc.nextDouble();

            Bankaccount acc = new Bankaccount(owner, initial);
            acc.deposit(amount);
            acc.displaySummary();
        }
    }
}