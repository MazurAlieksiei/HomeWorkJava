package home_work_2.loops;

public class NumberDigitsMultiplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Не корректный ввод!");
            return;
        }

        if (!args[0].chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (args[0].contains(".") || args[0].contains(",")){ //если введено число с точкой
                System.out.println("Введено не целое число");
                return;
            }
            if (args[0].contains("-")){
                System.out.println("Введено отрицательное число");
                return;
            }
            System.out.println("Введено не число");
            return;
        }

        long number = Long.parseLong(args[0]);
        System.out.println(sumDigits(number));
    }

    /**
     * Метод перемножения всех цифр числа между собой.
     * @param number Число, цифры которого необходимо перемножить.
     * @return Возвращает результат перемножения всех цифр числа.
     */
    public static long sumDigits (long number){
        String numberAsString = Long.toString(number);
        long[] digitsArray = new long[numberAsString.length()];
        long num = number;
        long result = 1;
        int i = digitsArray.length -1;
        while (num > 0) {
            result *= num % 10;
            digitsArray[i] = num % 10;
            num = num / 10;
            i--;
        }
        for (int j = 0; j < digitsArray.length; j++) {
            if (j == digitsArray.length - 1) {
                System.out.print(digitsArray[j] + " = ");
                break;
            }
            System.out.print(digitsArray[j] + " * ");
        }
        return result;
    }
}
