package home_work_1;


public class TaskOddNumbers {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 101); // явное преобразование делаем к int, так как рандом работает из коробки с вещественными типами
        int secondNumber = (int) (Math.random() * 101); // *101 -> увеличиваем диапазон чисел до 100, так как конечный диапозон не включается

        if (((firstNumber % 2 != 0) && (secondNumber % 2 != 0)) || ((firstNumber % 2 == 0) && (secondNumber % 2 == 0))) {
            firstNumber += 1;
        }

        if (firstNumber % 2 != 0) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
