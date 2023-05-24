package home_work_2.loops;

public class LoopsTasks {

    /**
     * Метод нахождения наибольшей цифры натурального числа.
     *
     * @param number Натуральное число.
     * @return Возвращает наибольшую цифру натурального числа.
     */
    public static String largestDigit(int number) {

        int maxNumber = number % 10;
        number = number / 10;
        while (number > 0) {
            if (number % 10 > maxNumber) { // если последняя цифра числа больше, то присваиваем ее maxNumber
                maxNumber = number % 10;
            }
            number /= 10; //убираем последнюю цифру числа делением на 10
        }
        return "Максимальная цифра числа: " + maxNumber;
    }

    /**
     * Метод нахождения вероятность генерации четных случайных чисел.
     */
    public static void evenNumbersProbability() {
        int digitsAmount = 1000;
        double randomEvenDigitsAmount = 0;
        for (int i = 0; i < digitsAmount; i++) {
            int a = (int) (Math.random() * 100);
            if (a % 2 == 0) {
                randomEvenDigitsAmount += 1;
            }
        }
        double result = ((randomEvenDigitsAmount / digitsAmount) * 100);
        System.out.println("Процент четных числе составляет: " + result + " % ");
    }

    /**
     * Метод считывания четных и нечетных цифры числа.
     *
     * @param number Число, цифры которого считаются.
     * @return Возвращает четные и нечетные цифры числа, введенного пользователем.
     */
    public static String evenAndOddNumbers(int number) {

        int even = 0;
        int odd = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            number /= 10;
        }
        return "четных " + even + ", нечетных " + odd;
    }

    /**
     * Метод выведения элементов ряда Фибоначчи.
     *
     * @param numberOfElements Количество элементов.
     * @return Возвращает элементы ряда Фибоначчи.
     */
    public static String fibonacciSeries(int numberOfElements) {
        String a = "1 2 ";
        StringBuilder stringBuilder = new StringBuilder(a);
        int element1 = 1;
        int element2 = 2;
        int b;

        for (int i = 3; i <= numberOfElements; i++) {
            stringBuilder.append((element1 + element2) + " ");
            b = element1;
            element1 = element2;
            element2 = b + element1;
        }
        return stringBuilder.toString();
    }

    /**
     * Метод выведения ряда чисел в определенном диапазоне с шагом.
     *
     * @param minValue Нижняя граница диапазона.
     * @param maxValue Верхняя граница диапазона.
     * @param step     Шаг.
     * @return Возвращает ряд чисел в определенном диапазоне с шагом.
     */
    public static String rangeOfNumbers(int minValue, int maxValue, int step) {
        String a = "";
        StringBuilder stringBuilder = new StringBuilder(a);
        for (int i = minValue; i <= maxValue; i += step) {
            stringBuilder.append(i + " ");
        }
        return stringBuilder.toString();
    }

    /**
     * Метод переворота числа. Число, переворот которого требуется, вводит пользователь.
     *
     * @param number Число, переворот которого требуется.
     * @return Возвращает перевернутое число.
     */
    public static int reversNumber(int number) {

        int reversNumber = 0;
        while (number > 0) {
            reversNumber = reversNumber * 10 + number % 10;
            number /= 10;
        }
        return reversNumber;
    }
}
