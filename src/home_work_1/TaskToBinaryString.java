package home_work_1;

import java.util.Scanner;

public class TaskToBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в диапазоне [-128;127]: ");
        byte number = in.nextByte();

        System.out.println(toBinary(number));
    }

    public static String toBinary(byte number) {
        String result = "";
        if (number >= 0) {
            result = toBinaryString(number);
        } else {
            number = (byte) Math.abs(number); // делаем отрицательное число положительным
            byte invertNumber = (byte) ~number; //получаем обратный код инверсией
            byte reversNumber = (byte) (invertNumber + 1); //получаем дополнительный код, добавлением 1
            result = toBinaryString(reversNumber);
        }
        return result;
    }

    public static String toBinaryString(byte value) {
        StringBuilder result = new StringBuilder(8);
        for (int i = 0; i < 8; ++i) {
            result.append(value & 1);
            value >>>= 1;
        }
        return result.reverse().toString();
    }
}
