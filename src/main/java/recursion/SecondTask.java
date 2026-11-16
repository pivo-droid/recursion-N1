package recursion;

// вторая задача: рекуррентная последовательность
public class SecondTask {

    public static long s(int n) {
        // два базовых случая
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        // два рекурсивных вызова
        return s(n - 1) + 2 * s(n - 2);
    }
}
