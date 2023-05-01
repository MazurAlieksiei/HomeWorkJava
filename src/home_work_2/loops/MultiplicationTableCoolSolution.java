package home_work_2.loops;

import java.util.Scanner;

public class MultiplicationTableCoolSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("С какого числа начинаем таблицу умножения?");
        int startNumber = in.nextInt(); // переменная, хранящая значение начального числа таблицы умножения
        System.out.println("Введите максимальное количество столбцов в строке");
        int maxCountColumnsInRow = in.nextInt(); /* переменная, хранящая максимальное количество столбцов,
        выводимых в одну строку в таблице
        */
        System.out.println("Введите количество количество столбцов в таблице умножения");
        int countColumns = in.nextInt(); // переменная, хранящая желаемое количество столбцов в таблице

        int countRow = (int) Math.ceil(countColumns / (double) maxCountColumnsInRow); /* переменная, хранящая в себе
        необходимое количество повторений цикла, для нахождения количества строк */

        System.out.println("Таблица умножения");
        for (int i = 0; i < countRow; i++) { // цикл, для нахождения необходимого количества строк в таблице
            int currentTo = startNumber + maxCountColumnsInRow + (maxCountColumnsInRow * i) - 1; /* переменная,
            хранящая в себе значение для конечного числа */

            int tmp = countColumns - (maxCountColumnsInRow * i); /* дополнительная переменная, хранящая значение
            желаемого количества столбцов */
            if (tmp < maxCountColumnsInRow){ // если желаемое количество столбцов больше максимального в одной строке
                currentTo = startNumber + (maxCountColumnsInRow * i) + tmp - 1;
            }

            printRow(startNumber + (maxCountColumnsInRow * i), currentTo); /* Вызов метода, для передачи ему значений
            начального числа таблицы и конечного числа. startNumber + (maxCountColumnsInRow * i) - дает число, с которого
            начнется во второй итерации printRow. Изначально (maxCountColumnsInRow * i) - 0.
            */
            System.out.println(); // для разделения строк между собой
        }
    }

    /**
     * Печать строки в консоль с указанными столбцами
     * @param from столбец, с которого начинается строка
     * @param to столбец, которым заканчивается строка
     */
    public static void printRow (int from, int to) {
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
