package home_work_1;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        switch (name) { //добавляем введенное имя в поле для сравнения спомощью команды switch
            case "Вася": //первое сравнение ввода с значением Вася
                System.out.print("Привет! \nЯ тебя так долго ждал");
                break; // точка остановки выполения операторов после конца команды switch. Если не поставить, будет выполняться весь надор операторов дальше
            case "Анастасия"://второе сравнение ввода с значением Анастасия, елси первый кейс не true
                System.out.print("Я тебя так долго ждал");
                break;
            default: // может и не быть, но добавлен для ввывода сообщения ниже, если все кейсы выше false
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
