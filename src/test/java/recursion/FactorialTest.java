package recursion;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    // общая проверка для обеих версий, чтобы не писать тесты два раза
    private void check(int n, long expected) {
        assertEquals(expected, Factorial.factorialLong(n));
        assertEquals(BigInteger.valueOf(expected), Factorial.factorialBig(n));
    }

    @Test
    void baseCase() {
        check(0, 1);
    }

    @Test
    void recursiveCases() {
        check(1, 1);
        check(2, 2);
        check(3, 6);
        check(5, 120);
        check(10, 3628800);
    }

    // ищем, с какого n версия с long начинает ошибаться
    @Test
    void findOverflow() {
        int firstWrong = -1;
        for (int n = 0; n <= 30; n++) {
            BigInteger big = Factorial.factorialBig(n);
            BigInteger fromLong = BigInteger.valueOf(Factorial.factorialLong(n));
            if (!big.equals(fromLong)) {
                firstWrong = n;
                break;
            }
        }
        System.out.println("long ошибается с n = " + firstWrong);
        assertEquals(21, firstWrong);
    }
}
