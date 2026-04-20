import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @BeforeAll
    static void setup() {
        System.out.println("=== Bắt đầu chạy MathUtilsTest ===");
    }
    // phải là static bởi vì đây là đoạn code được chạy đầu tiên trước khi mọi đối tượng được tạo ra

    @Test
    @DisplayName("MAX_01: a > b")
    void testMaxAGreaterThanB() {
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    @DisplayName("MAX_02: a < b")
    void testMaxALessThanB() {
        assertEquals(10, MathUtils.max(-5, 10));
    }

    @Test
    @DisplayName("MAX_03: a = b = 0")
    void testMaxAEqualsBAtZero() {
        assertEquals(0, MathUtils.max(0, 0));
    }

    @Test
    @DisplayName("MAX_04: (a max, b min)")
    void testMaxWithMaxAndMin() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("MAX_05: (a min, b max)")
    void testMaxWithMinAndMax() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("MAX_06: (a = b = max)")
    void testMaxEqualsAtMax() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("MAX_07: a = b = min")
    void testMaxEqualsAtMin() {
        assertEquals(Integer.MIN_VALUE, MathUtils.max(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    // Divide
    @Test
    @DisplayName("DIV_01: b > 0")
    void testBGreaterThanZero() {
    assertEquals(2, MathUtils.divide(10, 5));
    }

    @Test
    @DisplayName("DIV_02: b < 0")
    void testBLessThanZero() {
        assertEquals(-2, MathUtils.divide(10, -5));
    }

    @Test
    @DisplayName("DIV_03: Ngoại lệ chia 0")
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(1, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
    }


    @AfterAll
    static void clear(){
        System.out.println("=== Kết Thúc ===");
    }
}