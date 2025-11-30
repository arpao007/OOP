package op2;

public class Banka {
    private String ownerName;
    private double balance;

    public Banka(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}