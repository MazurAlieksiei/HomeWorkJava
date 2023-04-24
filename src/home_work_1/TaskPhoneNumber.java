package home_work_1;

import java.util.Scanner;

public class TaskPhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 10 случайных цифр от 0 до 9: ");
        String userInput = in.nextLine();

        char[] strToArray = userInput.replaceAll(" ", "").toCharArray();

        if (strToArray.length != 10) {
            System.out.println("Вы ввели неправильное количество цифр!");
            return;
        }

        System.out.println(createPhoneNumber(strToArray));
    }

    public static String createPhoneNumber(char[] strToArray) {
        String phoneNumber;
        phoneNumber = "(" + strToArray[0] + strToArray[1] + strToArray[2] + ")";
        phoneNumber += " " + strToArray[3] + strToArray[4] + strToArray[5];
        phoneNumber += "-" + strToArray[6] + strToArray[7] + strToArray[8] + strToArray[9];
        return phoneNumber;
    }
}