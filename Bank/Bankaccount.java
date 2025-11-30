package op2;

public class Bankaccount {

    private String ownerName;
    private double balance;

    public Bankaccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displaySummary() {
        System.out.println("Owner : " + ownerName);
        System.out.println("Balance : " + balance);
    }
}
