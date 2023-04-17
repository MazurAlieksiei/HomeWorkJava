package home_work_1;

import java.util.Scanner;

public class TaskIfElse1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        if (name.equals("Вася")) {
            System.out.print("Привет! \nЯ тебя так долго ждал");
        }
        if (name.equals("Анастасия")) {
            System.out.print("Я тебя так долго ждал");
        } else {
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
