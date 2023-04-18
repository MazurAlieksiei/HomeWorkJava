package home_work_1;

import java.util.Scanner; //импрортируем класс Scanner из пакета java.util

public class TaskSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        if (!name.chars().allMatch(Character::isLetter) || name.isEmpty()) { // проверка на использование только букв и остутвие пустой строки. Не буквы и пустая строка, то вывыести сообщение
            System.out.println("Так имена не пишут!");
            return; //точка выхода из программы, если условие сработало
        }

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
