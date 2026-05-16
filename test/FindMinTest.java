import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinTest {

    @Test
    void testFindMinComparable() {
        String[] names = {"Bob", "John", "Alice"};
        assertEquals("Alice", ElementarySort.findMin(names));
    }

    @Test
    void testFindMinComparator() {
        String[] names = {"Bob", "John", "Alice"};
        assertEquals("Bob", ElementarySort.findMin(names, new StringComparator()));
    }
}