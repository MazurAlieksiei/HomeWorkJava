package home_work_1;

import java.util.Scanner;

public class TaskToBinaryStringEasyVariant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        byte number = in.nextByte();

        System.out.println(toBinaryString(number));

    }

    public static String toBinaryString(byte number) {
        String binary = "";
        int n = 24;
        if (number >= 0) {
            binary = String.format("%8s", Integer.toBinaryString(number)).replaceAll(" ", "0");
        } else {
            binary =  Integer.toBinaryString(number).substring(n);
        }
        return binary;

    }
}