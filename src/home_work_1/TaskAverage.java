package home_work_1;

import java.util.Scanner;

public class TaskAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();

        System.out.println(getAvaregeNumber(firstNumber, secondNumber, thirdNumber));
    }

    public static int getAvaregeNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber > secondNumber && firstNumber < thirdNumber) || (firstNumber < secondNumber && firstNumber > thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber > firstNumber && secondNumber < thirdNumber) || (secondNumber < firstNumber && secondNumber > thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
