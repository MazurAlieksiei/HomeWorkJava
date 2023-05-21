package home_work_1;

import java.util.Scanner;

public class IfElseTask6Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TaskIfElse1 welcom1 = new TaskIfElse1();
        TaskIfElse2 welcom2 = new TaskIfElse2();
        TaskSwitch welcom3 = new TaskSwitch();
        System.out.print("Введите имя: ");
        String name = in.nextLine();


        System.out.println(welcom1.welcom(name));
    }
}
