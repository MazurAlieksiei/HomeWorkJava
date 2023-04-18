package home_work_1;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        switch (name) { //
            case "Вася":
                System.out.print("Привет! \nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.print("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
