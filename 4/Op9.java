package Op7;

class ImmutableAccount {
    
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        if (balance < 0) balance = 0.0;
        this.accountId = accountId;
        this.balance = balance;
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId() {  
        return accountId; 
    }
    
    public double getBalance() {  
        return balance; 
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(accountId, balance + amount);
        }
        System.out.println("Invalid deposit amount.");
        return this;
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        }
        return new ImmutableAccount(accountId, balance - amount);
    }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Op9 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String id = sc.nextLine();
        double init = sc.nextDouble();
        double dep = sc.nextDouble();
        double wd = sc.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, init);
        ImmutableAccount acc2 = acc1.deposit(dep);
        ImmutableAccount acc3 = acc2.withdraw(wd);

        acc1.displayInfo();
        acc3.displayInfo();

        sc.close();
    }
}
