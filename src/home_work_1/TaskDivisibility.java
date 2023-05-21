package home_work_1;

import java.util.Scanner;

public class TaskDivisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();

        System.out.println(getDivisibility(firstNumber, secondNumber));
    }

    public static String getDivisibility(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return "Ноль вводить нельзя!";
        }

        if (firstNumber % secondNumber == 0) {
            return (firstNumber + " делится на " + secondNumber + "\n"
                    + "Частное: " + (firstNumber / secondNumber));

        } else {
            return (firstNumber + " не делится на " + secondNumber + "\n"
                    + "Остаток: " + (firstNumber % secondNumber) + "\n"
                    + "Частное: " + (firstNumber / secondNumber));

        }
    }
}
