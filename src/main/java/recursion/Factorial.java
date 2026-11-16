package recursion;

import java.math.BigInteger;

public class Factorial {

    // факториал с результатом long
    public static long factorialLong(int n) {
        // базовый случай
        if (n == 0) {
            return 1;
        }
        // рекурсивный случай
        return n * factorialLong(n - 1);
    }

    // факториал с результатом BigInteger
    public static BigInteger factorialBig(int n) {
        // базовый случай
        if (n == 0) {
            return BigInteger.ONE;
        }
        // рекурсивный случай
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }
}
