package home_work_1;

import java.util.Scanner;

public class TaskDivisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();

        if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("Ноль вводить нельзя!");
            return;
        }

        if (firstNumber % secondNumber == 0) {
            System.out.printf("%d делится на %d\n", firstNumber, secondNumber);
            System.out.printf("Частное: %d", (firstNumber / secondNumber));
        } else {
            System.out.printf("%d не делится на %d\n", firstNumber, secondNumber);
            System.out.printf("Остаток: %d\n", (firstNumber % secondNumber));
            System.out.printf("Частное: %d", (firstNumber / secondNumber));
        }
    }
}
