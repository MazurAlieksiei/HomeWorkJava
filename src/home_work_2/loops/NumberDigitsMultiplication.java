package home_work_2.loops;


public class NumberDigitsMultiplication {

    public static String numberDigitsMultiplicationCheckAndReturn(String args) {

        String number = args;
        if (number.isEmpty()) {
            return "Не корректный ввод!";
        }

        if (!number.chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (number.contains(".") || number.contains(",")) { //если введено число с точкой
                return "Введено не целое число";
            }
            if (number.contains("-")) {
                return "Введено отрицательное число";
            }
            return "Введено не число";
        }


        return stringFormating(number);
    }

    public static long[] sumDigits(String number) {


        long[] digitsArray = new long[number.length()];
        long num = Long.parseLong(number);
        int i = digitsArray.length - 1;
        while (num > 0) {
            digitsArray[i] = num % 10;
            num = num / 10;
            i--;
        }
        return digitsArray;
    }

    /**
     * Метод перемножения всех цифр числа между собой.
     *
     * @param number Число, цифры которого необходимо перемножить.
     * @return Возвращает результат перемножения всех цифр числа.
     */
    public static String stringFormating(String number) {


        long[] digitsArray1 = sumDigits(number);

        String resultAsString = "";
        StringBuilder stringBuilder = new StringBuilder(resultAsString);
        long num = Long.parseLong(number);
        long result = 1;
        for (int j = 0; j < digitsArray1.length; j++) {

            result *= num % 10;
            num = num / 10;
            if (j == digitsArray1.length - 1) {
                stringBuilder.append(digitsArray1[j] + " = ");
                break;
            }
            stringBuilder.append(digitsArray1[j] + " * ");
        }

        return stringBuilder.toString() + result;
    }


}
