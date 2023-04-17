package home_work_1;

import java.util.Scanner; //импрортируем класс Scanner из пакета java.util

public class TaskIfElse1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// обявляем переменную относящуюся к классу Scanner
        System.out.print("Input name: ");
        String name = in.nextLine(); // объявляем переменную с типом String и используем метод для считывания всей введенной строки

        if (name.equals("Вася")) { // сравниваем введенную строку и имя
            System.out.print("Привет! \nЯ тебя так долго ждал"); // если выражение выше true, выводим текст. \n - для переноса на новую строку
        } // если услвоие false, то переходим к следующему (сверху вниз)
        if (name.equals("Анастасия")) { // сравниваем введенную строку и имя
            System.out.print("Я тебя так долго ждал"); // если выражение выше true, выводим текст.
        } else { //если все выше выражения false, выводим этот текст
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
