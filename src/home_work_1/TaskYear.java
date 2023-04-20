package home_work_1;

import java.util.Scanner;

public class TaskYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Обычный год");
        } else {
            System.out.println("Високосный год");
        }
    }
}
