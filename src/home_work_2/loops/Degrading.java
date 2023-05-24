package home_work_2.loops;

public class Degrading {

    public static String degradingString(String numberAsString, String degreeAsString) {

        if (numberAsString.isEmpty()) {
            return "Вы ничего не ввели";
        }
        double number = Double.parseDouble(numberAsString);

        if (degreeAsString.isEmpty()) {
            return "Вы ничего не ввели";
        }
        if (!degreeAsString.chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (degreeAsString.contains(".") || degreeAsString.contains(",")) { //если введено число с точкой
                return "Введено не целое число";
            }
            if (degreeAsString.contains("-")) {
                return "Введено отрицательное число";
            }
            return "Введено не число";

        }
        int degree = Integer.parseInt(degreeAsString);

        return number + " ^ " + degree + " = " + degradingMethod(number, degree);
    }


    /**
     * Метод возведения в степень.
     *
     * @param number Возводимое в степень число.
     * @param degree Степень, в которую возводят число.
     * @return Значение возведения в степень числа.
     */
    public static double degradingMethod(double number, int degree) {

        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }
}
