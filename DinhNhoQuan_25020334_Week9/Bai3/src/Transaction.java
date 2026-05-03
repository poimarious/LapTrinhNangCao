package bank_system;

import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Đại diện cho một giao dịch ngân hàng.
 */
public class Transaction {
    private static final Logger logger = LoggerFactory.getLogger(Transaction.class);

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    public static String getTypeString(int type) {
        return switch (type) {
            case TYPE_DEPOSIT_CHECKING -> "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING -> "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS -> "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS -> "Rút tiền tiết kiệm";
            default -> "Không rõ";
        };
    }

    public String getTransactionSummary() {
        logger.debug("Đang tạo bản tóm tắt cho giao dịch loại: {}", this.type);

        String typeStr = getTypeString(type);
        String initialStr = String.format(Locale.US, "%.2f", initialBalance);
        String amountStr = String.format(Locale.US, "%.2f", amount);
        String finalStr = String.format(Locale.US, "%.2f", finalBalance);

        return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%s. Số tiền: $%s. Số dư cuối: $%s.",
                typeStr, initialStr, amountStr, finalStr);
    }
}