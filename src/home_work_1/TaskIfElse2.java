package home_work_1;

import java.util.Scanner;//импрортируем класс Scanner из пакета java.util

public class TaskIfElse2 implements ICommunicationPrinter {


    @Override
    public String welcom(String name) {
        if (!name.chars().allMatch(Character::isLetter) || name.isEmpty()) {
            return "Так имена не пишут!";
        }

        if (name.equals("Вася")) {
            return name = "Привет! \nЯ тебя так долго ждал";
        } else if (name.equals("Анастасия")) {
            return name = "Я тебя так долго ждал";
        } else {
            return name = "Добрый день, а вы кто?";
        }
    }

}
