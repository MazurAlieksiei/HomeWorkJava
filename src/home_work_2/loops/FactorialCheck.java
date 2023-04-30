package home_work_2.loops;

public class FactorialCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Не корректный ввод!");
            return;
        }

        if (!args[0].chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (args[0].contains("-")){
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

        System.out.println(getFactorial(number));
    }

    public static long getFactorial(long number) {
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result = result * i;
            if (i == number) {
                System.out.print(i + " = ");
                break;
            }
            System.out.print(i + " * ");
        }
        return result;
    }
}
