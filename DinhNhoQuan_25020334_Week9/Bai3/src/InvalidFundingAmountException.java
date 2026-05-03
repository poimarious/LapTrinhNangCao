public class InvalidFundingAmountException extends BankException {
    public InvalidFundingAmountException(double amount) {
        super(String.format(java.util.Locale.US, "Số tiền không hợp lệ: $%.2f", amount));
    }
}