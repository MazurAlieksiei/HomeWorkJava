package home_work_1;

import java.util.Scanner; //импрортируем класс Scanner из пакета java.util

public class BitwiseOperations1 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in)); // обявляем переменную относящуюся к классу Scanner
        System.out.print("Input first number: "); // запрашиваем у пользовтеля ввод имени через консоль
        int firstNumber = in.nextInt(); // число 2 - 00000010
        System.out.print("Input second number: "); // запрашиваем у пользовтеля ввод имени через консоль
        int secondNumber = in.nextInt(); // число 5 - 00000101

        int firstResult = firstNumber & secondNumber; // 00000010 (число 2) & 00000101 (число 5) -> 00000000 (значение бита будет равно 1, если все соответю биты равны 1)
        int secondResult = firstNumber | secondNumber;// 00000010 (число 2) | 00000101 (число 5) -> 00000111 (значение бита будет равно 1, если хоть один  бит равен 1)

        System.out.println("Результат побитного 'И': " + firstResult);
        System.out.println("Результат побитного 'ИЛИ': " + secondResult);

    }
}
