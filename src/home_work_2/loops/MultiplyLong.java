package home_work_2.loops;

public class MultiplyLong {

    /**
     * Метод перемножения числа на заданный множитель. Умножает до переполнения long.
     * Выводит число перед переполнением и после переполнения.
     *
     * @param a          Число для умножения.
     * @param multiplier Множитель.
     */
    public static String multiply(long a, int multiplier) {

        while (true) {
            if (Math.abs(a) > Math.abs(Long.MAX_VALUE / multiplier)) {
                return "Число перед переполнением: " + a + " Число после переполнения: " + a * multiplier;
            }
            a = a * multiplier;
        }
    }
}
