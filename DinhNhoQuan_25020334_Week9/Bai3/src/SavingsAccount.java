package bank_system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tài khoản tiết kiệm với quy định rút tiền khắt khe.
 */
public class SavingsAccount extends Account {
    private static final Logger logger = LoggerFactory.getLogger(SavingsAccount.class);
    private static final double MAX_WITHDRAW_LIMIT = 1000.0;
    private static final double MIN_BALANCE_REQUIRED = 5000.0;

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double initialBalance = getBalance();
        try {
            doDepositing(amount);
            Transaction t = new Transaction(
                    Transaction.TYPE_DEPOSIT_SAVINGS, amount, initialBalance, getBalance());
            addTransaction(t);
            logger.info("Nạp tiền tiết kiệm thành công. TK: {}, Số tiền: {}", getAccountNumber(), amount);
        } catch (InvalidFundingAmountException e) {
            logger.warn("Nạp tiền thất bại: {}", e.getMessage());
        }
    }

    @Override
    public void withdraw(double amount) {
        double initialBalance = getBalance();
        try {
            if (amount > MAX_WITHDRAW_LIMIT) {
                throw new InvalidFundingAmountException(amount);
            }
            if (initialBalance - amount < MIN_BALANCE_REQUIRED) {
                throw new InsufficientFundsException(amount);
            }

            doWithdrawing(amount);
            Transaction t = new Transaction(
                    Transaction.TYPE_WITHDRAW_SAVINGS, amount, initialBalance, getBalance());
            addTransaction(t);
            logger.info("Rút tiền tiết kiệm thành công. TK: {}, Số dư mới: {}", getAccountNumber(), getBalance());
        } catch (BankException e) {
            logger.warn("Lỗi giao dịch rút tiền: {}", e.getMessage());
        }
    }
}