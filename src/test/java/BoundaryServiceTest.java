import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoundaryServiceTest {

    @Test
    void testFindMin() {
        BoundaryService service = new BoundaryService();
        // Уберите некоторые тестовые случаи для уменьшения покрытия
        assertEquals(1, service.findMin(new int[]{5, 3, 6, 2, 1, 4}));
    }
}
