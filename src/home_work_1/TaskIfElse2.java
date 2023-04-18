package home_work_1;

import java.util.Scanner;//импрортируем класс Scanner из пакета java.util

public class TaskIfElse2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // обявляем переменную относящуюся к классу Scanner
        System.out.print("Input name: "); // запрашиваем у пользовтеля ввод имени через консоль
        String name = in.nextLine(); // объявляем переменную с типом String и используем метод для считывания всей введенной строки

        if (!name.chars().allMatch(Character::isLetter) || name.isEmpty()){ // проверка на использование только букв и остутвие пустой строки. Не буквы и пустая строка, то вывыести сообщение
            System.out.println("Так имена не пишут!");
            return; //точка выхода из программы, если условие сработало
        }

        if (name.equals("Вася")) { // сравниваем введенную строку и имя
            System.out.print("Привет! \nЯ тебя так долго ждал"); // если выражение выше true, выводим текст. \n - для переноса на новую строку
        } else if (name.equals("Анастасия")) { // иначе если выражение выше false, сравниваем введенную строку и другое имя
            System.out.print("Я тебя так долго ждал");// если выражение выше true, выводим текст.
        } else { //если все выше выражения false, выводим этот текст
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
