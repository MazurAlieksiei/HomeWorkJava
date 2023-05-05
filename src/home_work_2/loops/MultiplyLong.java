package home_work_2.loops;

import java.util.Random;

public class MultiplyLong {
    public static void main(String[] args) {
        Random random = new Random();
        int anyMultiplier = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        long a = 1;
        multiply(a, 3);
        System.out.println();
        multiply(a, 188);
        System.out.println();
        multiply(a, -19);
        System.out.println();
        multiply(a, anyMultiplier);
    }

    /**
     * Метод перемножения числа на заданный множитель. Умножает до переполнения long.
     * Выводит число перед переполнением и после переполнения.
     *
     * @param a             Число для умножения.
     * @param multiplier Множитель.
     */
    public static void multiply(long a, int multiplier) {
        System.out.println("Стартовое число: " + a + "\nМножитель: " + multiplier);
        while (true) {
            if (Math.abs(a) > Math.abs(Long.MAX_VALUE / multiplier)) {
                System.out.println("Число перед переполнением: " + a);
                System.out.println("Число после переполнения: " + a * multiplier);
                return;
            }
            a = a * multiplier;
        }
    }
}
