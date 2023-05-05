package home_work_2.loops;

public class FactorialRecursion {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Не корректный ввод!");
            return;
        }

        if (!args[0].chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (args[0].contains("-")) {
                System.out.println("Введено отрицательное число");
                return;
            }
            System.out.println("Не корректный ввод!");
            return;
        }

        long number = Long.parseLong(args[0]);
        if (number > 20) {
            System.out.println("Введите число меньше либо равное 20");
            return;
        }
        System.out.println(number);
        System.out.println("= " + getFactorial(number));
    }

    /**
     * Метод нахождения факториала числа с помощью рекурсии
     * @param number число, факториал которого необходимо найти
     * @return возвращает значение факториала числа
     */
    public static long getFactorial(long number) {
        long result;

        if (number == 0) {
            return 1;
        }
        result = getFactorial(number - 1) * number;
        System.out.print(number + " * ");
        return result;
    }
}
