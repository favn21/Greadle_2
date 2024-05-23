import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoundaryServiceTest {

    @Test
    @DisplayName("Тест, который упадет из-за недостаточного покрытия")
    void testInsufficientCoverage() {
        BoundaryService service = new BoundaryService();
        int[] marks = {5, 3, 8, 1};
        assertThrows(IllegalArgumentException.class, () -> service.findMin(new int[0]));
    }
}
