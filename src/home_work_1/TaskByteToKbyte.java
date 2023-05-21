package home_work_1;

import java.util.Scanner;

public class TaskByteToKbyte {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.print("Перевести в байты (b) или в килобайты (k) : ");
        String translate = in.next();

        System.out.println(getByteToKbyte(number, translate));
    }

    public static String getByteToKbyte(int number, String translate) {
        switch (translate) {
            case "b":
                return number + " Килобайты = " + (number * 1024) + " байт";
            case "k":
                return number + " байт = " + (number / 1024.0) + " Килобайт";
        }
        return "Неправильный ввод";
    }
}
