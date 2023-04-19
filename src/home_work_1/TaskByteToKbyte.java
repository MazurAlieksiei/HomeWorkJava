package home_work_1;

import java.util.Scanner;

public class TaskByteToKbyte {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.print("Перевести в байты (b) или в килобайты (k) : ");
        String translate = in.next();

        if (translate.equals("b")) {
            System.out.printf("%d Килобайты = %d байт", number, (number * 1024));
        } else if (translate.equals("k")) {
            System.out.printf("%d байт = %.2f Килобайт", number, (number / 1024.0));
        }
    }
}
