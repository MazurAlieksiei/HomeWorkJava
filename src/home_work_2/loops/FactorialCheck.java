package home_work_2.loops;

public class FactorialCheck {
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
        return getFactorialCasual(number);
    }

    /**
     * Метод вычисления факториала числа.
     *
     * @param number Числа, факториал которого необходимо вычислить.
     * @return Возвращает значение факториала числа, введенного пользователем.
     */
    public static String getFactorialCasual(long number) {
        String resultAsString = "";
        StringBuilder stringBuilder = new StringBuilder(resultAsString);
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result = result * i;
            if (i == number) {
                stringBuilder.append(i + " = ");
                break;
            }
            stringBuilder.append(i + " * ");
        }
        return stringBuilder.toString() + result;
    }
}
