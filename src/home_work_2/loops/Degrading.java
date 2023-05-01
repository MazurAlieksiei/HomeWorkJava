package home_work_2.loops;

import java.util.Scanner;

public class Degrading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, возводимое в степень: ");
        String numberAsString = in.nextLine();
        if (numberAsString.isEmpty()) {
            System.out.println("Вы ничего не ввели");
            return;
        }
        double number = Double.parseDouble(numberAsString);

        System.out.print("Введите степень: ");
        String degreeAsString = in.nextLine();
        if (degreeAsString.isEmpty()) {
            System.out.println("Вы ничего не ввели");
            return;
        }
        if (!degreeAsString.chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (degreeAsString.contains(".") || degreeAsString.contains(",")) { //если введено число с точкой
                System.out.println("Введено не целое число");
                return;
            }
            if (degreeAsString.contains("-")) {
                System.out.println("Введено отрицательное число");
                return;
            }
            System.out.println("Введено не число");
            return;
        }
        int degree = Integer.parseInt(degreeAsString);

        System.out.println(number + " ^ " + degree + " = " + degradingMethod(number, degree));


    }

    public static double degradingMethod(double number, int degree) {
        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }
}
