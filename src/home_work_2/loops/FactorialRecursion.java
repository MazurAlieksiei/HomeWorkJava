package home_work_2.loops;

public class FactorialRecursion {
    public static String getFactorialResult(String args) {

        if (args.isEmpty()) {
            return "Не корректный ввод!";
        }

        if (!args.chars().allMatch(Character::isDigit)) {
            if (args.contains("-")) {
                return "Введено отрицательное число";
            }
            return "Не корректный ввод!";
        }

        long number = Long.parseLong(args);
        if (number > 20) {
            return "Введите число меньше либо равное 20";

        }
        return stringForGetFactorialRecursion(number) + getFactorialRecursion(number);
    }

    /**
     * Метод нахождения факториала числа с помощью рекурсии.
     *
     * @param number Число, факториал которого необходимо найти.
     * @return Возвращает значение факториала числа.
     */
    public static long getFactorialRecursion(long number) {
        long result;

        if (number == 0) {
            return 1;
        }
        result = getFactorialRecursion(number - 1) * number;

        return result;
    }

    /**
     * Метод для формирования строки, определенного вида для факториала через рекурсию.
     *
     * @param number Число, факториал которого необходимо найти.
     * @return Возвращает строку для факториала через рекурсию.
     */
    public static String stringForGetFactorialRecursion(long number) {
        String resultAsString = "";
        StringBuilder stringBuilder = new StringBuilder(resultAsString);

        for (int i = 1; i <= number; i++) {
            if (i == number) {
                stringBuilder.append(i + " = ");
            } else {
                stringBuilder.append(i + " * ");
            }
        }
        return stringBuilder.toString();
    }
}
