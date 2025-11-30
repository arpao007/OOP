package op2;

import java.util.Scanner;

public class Bankm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String owner = sc.nextLine();

        System.out.print("Enter your initial balance : ");
        double initial = sc.nextDouble();

        System.out.print("Enter your amount to deposit : ");
        double amount = sc.nextDouble();

        Bankaccount acc = new Bankaccount(owner, initial);
        acc.deposit(amount);

        System.out.println("\n=== Account Summary ===");
        acc.displaySummary();

        sc.close();
    }
}