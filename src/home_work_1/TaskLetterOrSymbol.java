package home_work_1;

import java.util.Scanner;

public class TaskLetterOrSymbol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите: ");
        int userInput = in.nextInt();

//        if ((userInput <= 90 && userInput >= 65) || (userInput <= 122 && userInput >= 97)){
//            System.out.println("Это буква " + (char) userInput);
//        } else {
//            System.out.println("Это не буква, а символ " + (char) userInput);
//        }

        System.out.println(getLetterOrSymbol(userInput));
    }

    public static String getLetterOrSymbol(int userInput) {
        if ((userInput <= 'Z' && userInput >= 'A') || (userInput <= 'z' && userInput >= 'a')) {
            return "Это буква " + (char) userInput;
        } else {
            return "Это не буква, а символ " + (char) userInput;
        }
    }
}
