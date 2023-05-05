package home_work_2.loops;

import java.util.Scanner;

public class LoopsTasks {
    public static void main(String[] args) {

        largestDigit();
        System.out.println();
        evenNumbersProbability();
        System.out.println();
        evenAndOddNumbers();
        System.out.println();
        fibonacciSeries();
        System.out.println();
        rangeOfNumbers();
        System.out.println();
        reversNumber();
    }

    /**
     * Метод находит наибольшую цифру натурального числа, введенного пользователем.
     */
    public static void largestDigit() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        String numberAsString = in.nextLine();

        if (!numberAsString.chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (numberAsString.contains(".") || numberAsString.contains(",")) { //если введено число с точкой
                System.out.println("Введено не натуральное число");
                return;
            }
            if (numberAsString.contains("-")) {
                System.out.println("Введено отрицательное число");
                return;
            }
            System.out.println("Введено не число");
            return;
        }

        int number = Integer.parseInt(numberAsString);
        if (number == 0) {
            System.out.println("Ноль вводить нельзя!");
            return;
        }
        int maxNumber = number % 10;
        number = number / 10;
        while (number > 0) {
            if (number % 10 > maxNumber) { // если последняя цифра числа больше, то присваиваем ее maxNumber
                maxNumber = number % 10;
            }
            number /= 10; //убираем последнюю цифру числа делением на 10
        }
        System.out.println("Максимальная цифра числа: " + maxNumber);
    }

    /**
     * Метод находит вероятность генерации четных случайных чисел.
     */
    public static void evenNumbersProbability() {
        int digitsAmount = 1000;
        double randomEvenDigitsAmount = 0;
        for (int i = 0; i < digitsAmount; i++) {
            int a = (int) (Math.random() * 100);
            if (a % 2 == 0) {
                randomEvenDigitsAmount += 1;
            }
        }
        double result = ((randomEvenDigitsAmount / digitsAmount) * 100);
        System.out.println("Процент четных числе составляет: " + result + " % ");
    }

    /**
     * Метод считает четные и нечетные цифры числа, введенного пользователем.
     */
    public static void evenAndOddNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        String numberAsString = in.nextLine();

        if (!numberAsString.chars().allMatch(Character::isDigit)) { //проверка на то, является ли все символы в строке цифрами
            if (numberAsString.contains(".") || numberAsString.contains(",")) { //если введено число с точкой
                System.out.println("Введено не натуральное число");
                return;
            }
            if (numberAsString.contains("-")) {
                System.out.println("Введено отрицательное число");
                return;
            }
            System.out.println("Введено не число");
            return;
        }

        int number = Integer.parseInt(numberAsString);
        if (number == 0) {
            System.out.println("Ноль вводить нельзя!");
            return;
        }

        int even = 0;
        int odd = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            number /= 10;
        }
        System.out.println("четных " + even + ", нечетных " + odd);
    }

    /**
     * Метод выводит элементы ряда Фибоначчи, количество которых указано пользователем.
     */
    public static void fibonacciSeries() {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите сколько элементов ряда Фибоначчи вывести: ");
        int numberOfElements = in.nextInt();
        int element1 = 1;
        int element2 = 2;
        int b;
        System.out.print(element1 + " " + element2 + " ");
        for (int i = 3; i <= numberOfElements; i++) {
            System.out.print((element1 + element2) + " ");
            b = element1;
            element1 = element2;
            element2 = b + element1;
        }
    }

    /**
     * Метод выводит ряд чисел в диапазоне с шагом. "От" и "до", и "шаг" указывается пользователем.
     */
    public static void rangeOfNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите минимальное число: ");
        int minValue = in.nextInt();
        System.out.print("Введите максимальное число: ");
        int maxValue = in.nextInt();
        System.out.print("Введите шаг: ");
        int step = in.nextInt();

        for (int i = minValue; i <= maxValue; i += step) {
            System.out.print(i + " ");
        }
    }

    /**
     * Метод выводит перевернутое число. Число, переворот которого требуется, вводит пользователь.
     */
    public static void reversNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для переворота: ");
        int number = in.nextInt();

        int reversNumber = 0;
        while (number > 0) {
            reversNumber = reversNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reversNumber);
    }
}
