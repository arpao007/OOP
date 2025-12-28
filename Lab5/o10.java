package Op8;

import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class o10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String complexDesc = sc.nextLine();
        int complexHours = Integer.parseInt(sc.nextLine());
        double setupFee = Double.parseDouble(sc.nextLine());

        String simpleDesc = sc.nextLine();
        int simpleHours = Integer.parseInt(sc.nextLine());

        ProjectTask t1 = new ComplexTask(complexDesc, complexHours, setupFee);
        ProjectTask t2 = new SimpleTask(simpleDesc, simpleHours);

        ProjectTask[] tasks = { t1, t2 };

        for (ProjectTask t : tasks) {
            System.out.printf("%.1f%n", t.calculateCost());
        }

        sc.close();
    }
}
