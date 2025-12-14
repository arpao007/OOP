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
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        double tax = getAnnualSalary() * taxRate;
        tax = Math.round(tax * 100) / 100.0; // ตัด floating error
        return Math.ceil(tax);
    }
}

public class Op12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double monthlySalary = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double raiseAmount = sc.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        System.out.printf("Tax (Before): %.1f\n", emp.calculateTax(taxRate));
        emp.giveRaise(raiseAmount);
        System.out.printf("Tax (After): %.1f\n", emp.calculateTax(taxRate));

        sc.close();
    }
}
