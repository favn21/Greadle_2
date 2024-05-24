import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoundaryServiceTest {

    @Test
    @DisplayName("Падение проверки покрытия")
    void testFindMin() {
        BoundaryService service = new BoundaryService();
        int[] marks = {};
        int min = service.findMin(marks);
    }
}
