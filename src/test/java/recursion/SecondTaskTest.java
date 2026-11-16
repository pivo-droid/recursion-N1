package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @Test
    void baseCases() {
        assertEquals(2, SecondTask.s(0));
        assertEquals(3, SecondTask.s(1));
    }

    @Test
    void recursiveCases() {
        assertEquals(7, SecondTask.s(2));
        assertEquals(13, SecondTask.s(3));
        assertEquals(27, SecondTask.s(4));
    }
}
