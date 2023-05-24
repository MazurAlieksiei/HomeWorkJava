package home_work_1;


public class TaskSwitch implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        if (!name.chars().allMatch(Character::isLetter) || name.isEmpty()) {
            return "Так имена не пишут!";
        }

        switch (name) {
            case "Вася":
                return "Привет! \nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
