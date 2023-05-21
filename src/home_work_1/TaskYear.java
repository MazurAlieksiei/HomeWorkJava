package home_work_1;

import java.util.Scanner;

public class TaskYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        System.out.println(getYear(year));
    }

    public static String getYear(int year) {
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)) {
            return "Обычный год";
        } else {
            return "Високосный год";
        }
    }
}
