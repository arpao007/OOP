package Op8;

import java.util.Scanner;

class Employee {

    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        double extraBonus = salary * 0.05;
        return baseBonus + extraBonus;
    }
}

public class o3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double inputSalary = sc.nextDouble();

        Manager manager = new Manager();

        manager.salary = inputSalary;

        System.out.println(manager.calculateBonus());

        sc.close();
    }
}
