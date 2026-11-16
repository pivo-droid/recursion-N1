package recursion;

// первая задача: двойной факториал
public class FirstTask {

    public static long doubleFactorial(int n) {
        // два базовых случая
        if (n == 0 || n == 1) {
            return 1;
        }
        // рекурсивный случай, шаг на 2
        return n * doubleFactorial(n - 2);
    }
}
