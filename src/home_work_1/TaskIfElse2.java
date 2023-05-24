package home_work_1;


public class TaskIfElse2 implements ICommunicationPrinter {


    @Override
    public String welcom(String name) {
        if (!name.chars().allMatch(Character::isLetter) || name.isEmpty()) {
            return "Так имена не пишут!";
        }

        if (name.equals("Вася")) {
            return  "Привет! \nЯ тебя так долго ждал";
        } else if (name.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }

}
