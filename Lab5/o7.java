package Op8;

import java.util.Scanner;

class Ep {
    protected String name;
    protected double baseSalary;

    public Ep(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Ep {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Mg extends Ep {
    protected double fixedBonus;

    public Mg(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Ep e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class o7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String salesName = sc.nextLine();
        double salesSalary = Double.parseDouble(sc.nextLine());
        double rate = Double.parseDouble(sc.nextLine());

        String managerName = sc.nextLine();
        double managerSalary = Double.parseDouble(sc.nextLine());
        double bonus = Double.parseDouble(sc.nextLine());

        SalesEmployee s = new SalesEmployee(salesName, salesSalary, rate);
        Mg m = new Mg(managerName, managerSalary, bonus);

        PayrollProcessor.process(s);
        PayrollProcessor.process(m);

        sc.close();
    }
}
