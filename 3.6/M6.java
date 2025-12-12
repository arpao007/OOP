package Oop;

import java.util.Scanner;

public class M6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Initial Balance : ");
            double initial = sc.nextDouble();

            System.out.print("Deposit Amount : ");
            double dep = sc.nextDouble();

            System.out.print("Withdraw Amount : ");
            double wd = sc.nextDouble();

            Op6 acc = new Op6(initial);

            acc.deposit(dep);
            acc.withdraw(wd);

            System.out.println("Final Balance: " + acc.getBalance());
        }
    }
}