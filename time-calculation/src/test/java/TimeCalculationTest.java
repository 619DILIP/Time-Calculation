import com.example.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TimeCalculationTest {
    
        @Test
    public void testCalculateHours() {
        // Test cases for the calculateHours method
        assertEquals("45 minutes", Main.calculateHours(new Integer[]{15, 30}));
        assertEquals("1 hour30.0 minutes", Main.calculateHours(new Integer[]{60, 30}));
        assertEquals("2 hours", Main.calculateHours(new Integer[]{60, 60}));
        assertEquals("1 hour", Main.calculateHours(new Integer[]{60}));
        assertEquals("90 minutes", Main.calculateHours(new Integer[]{45, 45}));
        assertEquals("2 hours30.0 minutes", Main.calculateHours(new Integer[]{60, 60, 30}));
    }
}
