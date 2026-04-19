public class BankAccount {

    private int balance;
    
    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposit successfully. Your now balance is: " + balance);
    }
    public synchronized void withdraw(int amount) {
        this.balance -= amount;
        System.out.println("Withdraw successfully. Your now balance is: " + balance);
    } 
}
