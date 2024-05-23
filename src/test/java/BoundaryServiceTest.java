import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoundaryServiceTest {

    @Test
    @DisplayName("Поиск минимального значения в массиве")
    void testFindMin() {
        BoundaryService service = new BoundaryService();
        int[] marks = {5, 3, 8, 1};
        int min = service.findMin(marks);
        assertEquals(1, min);
    }
}
