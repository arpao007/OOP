package Oop;

import java.util.Scanner;

class Employee {

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary = monthlySalary + amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double calculateAnnualSalary() {
        double annualSalary;
        annualSalary = monthlySalary * 12;
        return annualSalary;
    }

    public double calculateTax(double taxRate) {
        double annualSalary;
        double tax;

        annualSalary = calculateAnnualSalary();
        tax = annualSalary * taxRate;

        tax = Math.round(tax * 100);
        tax = tax / 100.0;
        tax = Math.ceil(tax);

        return tax;
    }
}

public class Op12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double monthlySalary;
        double taxRate;
        double raiseAmount;

        name = sc.nextLine();
        monthlySalary = sc.nextDouble();
        taxRate = sc.nextDouble();
        raiseAmount = sc.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        double taxBefore;
        taxBefore = emp.calculateTax(taxRate);
        System.out.printf("Tax (Before): %.1f\n", taxBefore);

        emp.giveRaise(raiseAmount);

        double taxAfter;
        taxAfter = emp.calculateTax(taxRate);
        System.out.printf("Tax (After): %.1f\n", taxAfter);

        sc.close();
    }
}
