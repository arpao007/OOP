package Op7;

import java.util.Scanner;

class Subscription {
    
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        if (durationDays > maxDuration) durationDays = maxDuration;
        if (durationDays < 0) durationDays = 0;
        this.planName = planName;
        this.durationDays = durationDays;
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }
        int newDays = durationDays + days;
        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }
        System.out.println("Extension successful.");
        return new Subscription(planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Op13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        sc.nextLine();
        Subscription.setMaxDuration(max);

        String name = sc.nextLine();
        int days = sc.nextInt();
        int ex1 = sc.nextInt();
        int ex2 = sc.nextInt();

        Subscription s1 = new Subscription(name, days);
        Subscription s2 = s1.extend(ex1);
        Subscription s3 = s2.extend(ex2);

        s3.displayInfo();
    }
}
