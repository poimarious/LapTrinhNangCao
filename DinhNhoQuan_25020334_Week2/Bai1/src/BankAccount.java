public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String aN, String oN) {
        this.accountNumber = aN;
        this.ownerName = oN;
        this.balance = 0;
    }

    public BankAccount(String aN, double b, String oN) {
        if(b < 0) {
            System.out.println("Error: balance must be greater than zero.");
            return ;
        }
        this.accountNumber = aN;
        this.balance = b;
        this.ownerName = oN;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Error: The deposit amount must be greater than zero.");
            return ;
        }
        this.balance  += amount;
    }

    public boolean withdraw(double amount) {
        if(amount <= 0 || amount > this.balance) {
            System.out.println("Error: The withdrawal amount must be better than zero and smaller than balance.");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void getBalance() {
        System.out.println("Balance: " + this.balance);
    }

}
