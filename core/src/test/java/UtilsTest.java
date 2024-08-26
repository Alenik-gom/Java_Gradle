import org.junit.jupiter.api.Test;
import ru.clevertec.Utils;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UtilsTest {
    @Test
    public void testIsAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("12", "79"));
        assertFalse(Utils.isAllPositiveNumbers("12", "-79"));
    }
}