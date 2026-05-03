public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(double amount) {
        super(String.format(java.util.Locale.US, "Số dư không đủ $%.2f", amount));
    }
}