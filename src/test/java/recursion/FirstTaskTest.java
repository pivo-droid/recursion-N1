package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskTest {

    @Test
    void baseCases() {
        assertEquals(1, FirstTask.doubleFactorial(0));
        assertEquals(1, FirstTask.doubleFactorial(1));
    }

    @Test
    void recursiveCases() {
        assertEquals(15, FirstTask.doubleFactorial(5));
        assertEquals(48, FirstTask.doubleFactorial(6));
        assertEquals(8, FirstTask.doubleFactorial(4));
        assertEquals(105, FirstTask.doubleFactorial(7));
    }
}
