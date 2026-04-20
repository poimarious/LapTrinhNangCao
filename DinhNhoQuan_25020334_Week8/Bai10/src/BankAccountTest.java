import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    // Chạy trước mỗi @Test để chuẩn bị dữ liệu
    @BeforeEach
    void setUp() {
        // Số dư ban đầu luôn là 500.0 trước mỗi bài test
        account = new BankAccount("123456", "Nguyen Van A", 500.0);
    }

    // ==========================================
    // TEST CHO DEPOSIT (NẠP TIỀN)
    // ==========================================

    @Test
    @DisplayName("DEP_01 & 02: Nạp tiền <= 0 (Biên vô lệ) -> Ném ngoại lệ")
    void testDepositInvalidAmounts() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0.0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-0.01));

        // Đảm bảo số dư không bị thay đổi sau khi ném lỗi
        assertEquals(500.0, account.getBalance());
    }

    @Test
    @DisplayName("DEP_03: Nạp tiền dương sát biên 0 (0.01)")
    void testDepositMinimumValidAmount() {
        account.deposit(0.01);
        assertEquals(500.01, account.getBalance());
    }

    @Test
    @DisplayName("DEP_04: Nạp tiền dương bình thường (100.0)")
    void testDepositNormalAmount() {
        account.deposit(100.0);
        assertEquals(600.0, account.getBalance());
    }

    // ==========================================
    // TEST CHO WITHDRAW (RÚT TIỀN)
    // ==========================================

    @Test
    @DisplayName("WIT_01: Rút tiền <= 0 -> Ném ngoại lệ")
    void testWithdrawInvalidAmounts() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0.0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
        assertEquals(500.0, account.getBalance());
    }

    @Test
    @DisplayName("WIT_02: Rút số tiền rất nhỏ (0.01) -> Thành công")
    void testWithdrawMinimumValidAmount() {
        boolean result = account.withdraw(0.01);
        assertTrue(result);
        assertEquals(499.99, account.getBalance());
    }

    @Test
    @DisplayName("WIT_03: Rút toàn bộ số dư (500.0) -> Thành công, dư 0")
    void testWithdrawExactBalance() {
        boolean result = account.withdraw(500.0);
        assertTrue(result);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    @DisplayName("WIT_04: Rút vượt quá số dư (500.01) -> Thất bại, giữ nguyên số dư")
    void testWithdrawMoreThanBalance() {
        boolean result = account.withdraw(500.01);
        assertFalse(result);
        assertEquals(500.0, account.getBalance()); // Số dư vẫn bảo toàn
    }

    @Test
    @DisplayName("SEQ_01: Kiểm tra luồng Nạp/Rút liên tiếp")
    void testAccountConsistencySequence() {
        BankAccount seqAccount = new BankAccount("999999", "Trần Thị B", 0.0);

        assertEquals(0.0, seqAccount.getBalance());

        seqAccount.deposit(500.0);
        assertEquals(500.0, seqAccount.getBalance());

        boolean firstWithdraw = seqAccount.withdraw(200.0);
        assertTrue(firstWithdraw);
        assertEquals(300.0, seqAccount.getBalance());

        boolean secondWithdraw = seqAccount.withdraw(400.0);
        assertFalse(secondWithdraw);

        assertEquals(300.0, seqAccount.getBalance());
    }
}