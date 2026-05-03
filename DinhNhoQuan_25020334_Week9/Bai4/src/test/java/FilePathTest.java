import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathTest {

    @Test
    public void testFilePathCreation_NioPath() {
        // Nối đường dẫn an toàn bằng Paths.get()
        Path filePath = Paths.get("logs", "app.log"); 

        Path parent = filePath.getParent();
        
        assertNotNull(parent, "Parent directory should not be null");
        assertEquals("logs", parent.toString(), "Parent directory should be 'logs'");
    }
}
