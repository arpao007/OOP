package Op8;

import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class o14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stdId = sc.nextLine();
        double stdBaseFee = Double.parseDouble(sc.nextLine());

        String premId = sc.nextLine();
        double premBaseFee = Double.parseDouble(sc.nextLine());
        double premInsuranceFee = Double.parseDouble(sc.nextLine());

        StandardShipping stdShipping = new StandardShipping(stdId, stdBaseFee);
        PremiumShipping premShipping = new PremiumShipping(premId, premBaseFee, premInsuranceFee);

        Shipping[] shipments = {stdShipping, premShipping};

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}
