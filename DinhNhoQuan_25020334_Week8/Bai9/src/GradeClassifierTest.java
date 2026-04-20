import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeClassifierTest {
    @Test
    @DisplayName("TC_01: Dưới biên 0.0 (-0.01) -> Ném ngoại lệ")
    void testGpaBelowZero() {
        double invalidGpa = -0.01;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(invalidGpa);
        });
        assertEquals("GPA không hợp lệ: " + invalidGpa, exception.getMessage());
    }

    @Test
    @DisplayName("TC_02: Tại biên 0.0 -> Yếu")
    void testGpaAtZero() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(0.0));
    }

    @Test
    @DisplayName("TC_03: Giữa vùng Yếu (3.5) -> Yếu")
    void testGpaMidWeak() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(3.5));
    }

    @Test
    @DisplayName("TC_04: Sát dưới biên 5.0 (4.99) -> Yếu")
    void testGpaJustBelowFive() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(4.99));
    }

    @Test
    @DisplayName("TC_05: Tại biên 5.0 -> Trung bình")
    void testGpaAtFive() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(5.0));
    }

    @Test
    @DisplayName("TC_06: Sát dưới biên 6.5 (6.49) -> Trung bình")
    void testGpaJustBelowSixPointFive() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(6.49));
    }

    @Test
    @DisplayName("TC_07: Tại biên 6.5 -> Khá")
    void testGpaAtSixPointFive() {
        assertEquals("Khá", GradeClassifier.classifyGrade(6.5));
    }

    @Test
    @DisplayName("TC_08: Sát dưới biên 8.0 (7.99) -> Khá")
    void testGpaJustBelowEight() {
        assertEquals("Khá", GradeClassifier.classifyGrade(7.99));
    }

    @Test
    @DisplayName("TC_09: Tại biên 8.0 -> Giỏi")
    void testGpaAtEight() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(8.0));
    }

    @Test
    @DisplayName("TC_10: Tại biên cực đại 10.0 -> Giỏi")
    void testGpaAtTen() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(10.0));
    }

    @Test
    @DisplayName("TC_11: Vượt biên 10.0 (10.01) -> Ném ngoại lệ")
    void testGpaAboveTen() {
        double invalidGpa = 10.01;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(invalidGpa);
        });
        assertEquals("GPA không hợp lệ: " + invalidGpa, exception.getMessage());
    }
}