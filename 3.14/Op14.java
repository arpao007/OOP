package Oop;

import java.util.Scanner;

class BankAccount {

    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit > 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            totalTransactionCount = totalTransactionCount + 1;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= balance) {
            balance = balance - amount;
            totalTransactionCount = totalTransactionCount + 1;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Op14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount myAccount = null;

        int N;
        N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {

            String command;
            command = sc.nextLine();

            if (command.equals("CREATE")) {

                double initialDeposit;
                initialDeposit = sc.nextDouble();
                sc.nextLine();
                myAccount = new BankAccount(initialDeposit);

            } else if (command.equals("DEPOSIT")) {

                double amount;
                amount = sc.nextDouble();
                sc.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }

            } else if (command.equals("WITHDRAW")) {

                double amount;
                amount = sc.nextDouble();
                sc.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }

            } else if (command.equals("STATUS")) {

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (command.equals("GLOBAL_STATUS")) {

                System.out.println(
                    "Total Transactions: " + BankAccount.getTotalTransactionCount()
                );
            }
        }

        sc.close();
    }
}
