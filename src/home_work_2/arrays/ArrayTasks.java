package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.utils.ArrayUtils.arrayRandom;

public class ArrayTasks {
    public static void main(String[] args) {
        sumOddElements();
        System.out.println();
        maxFromOddElements();
        System.out.println();
        lessArithmeticMean();
        System.out.println();
        twoSmallestElements();
        System.out.println();
        arrayCompression();
        System.out.println();
        sumOfDigits();
    }

    /**
     * Метод вычисляет сумму четных положительных элементов массива. Массив заполняется случайными числами.
     */
    public static void sumOddElements() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println(Arrays.toString(array));
        System.out.println(sumOddElementsInternal(array));
    }

    public static String sumOddElementsInternal(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                sum = sum + array[i];
            }
        }
        return "Сумма равна: " + sum;
    }

    /**
     * Метод находит максимальный из элементов массива с четными индексами. Массив заполняется случайными числами.
     */
    public static void maxFromOddElements() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println(maxFromOddElementsInternal(array));
    }

    public static String maxFromOddElementsInternal(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return "Максимальный элемент: " + maxElement;
    }

    /**
     * Метод находит элементы массива, которые меньше среднего арифметического.
     * Массив заполняется случайными числами.
     */
    public static void lessArithmeticMean() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Среднее арифметическое: " + lessArithmeticMeanInternal(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lessArithmeticMeanInternal(array)) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int lessArithmeticMeanInternal(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int arithmeticMean = sum / array.length;
        return arithmeticMean;
    }

    /**
     * Метод находит два наименьших (минимальных) элемента массива.
     * Массив заполняется случайными числами.
     */
    public static void twoSmallestElements() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println(twoSmallestElementsInternal(array));
    }

    public static String twoSmallestElementsInternal(int[] array) {
        int min1;
        int min2;
        int buff;

        if (array[0] < array[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[min1]) {
                buff = min1;
                min1 = i;
                if (array[buff] < array[min2]) {
                    min2 = buff;
                }
            } else if (array[i] < array[min2]) {
                min2 = i;
            }
        }
        return "Первый элемент: " + array[min1] + "\nВторой элемент: " + array[min2];
    }

    /**
     * Метод сжимает массив, удалив элементы, принадлежащие интервалу.
     * Массив заполняется случайными числами.
     */
    public static void arrayCompression() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Введите удаляемый диапазон");
        Scanner in = new Scanner(System.in);
        System.out.print("Нижняя граница: ");
        int lBorder = in.nextInt();
        System.out.print("Верхняя граница: ");
        int hBorder = in.nextInt();


        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] arrayCompressionInternal(int[] array, int hBorder, int lBorder) {
        int i = 0;
        int m = array.length;
        while (i < m) {
            if (array[i] <= hBorder && array[i] >= lBorder) {
                m -= 1;
                for (int j = i; j < m; j++) {
                    array[j] = array[j + 1];
                }
            } else {
                i += 1;
            }
        }
        return Arrays.copyOfRange(array, 0, m);
    }

    /**
     * Метод находит сумму цифр массива.
     * Массив заполняется случайными числами.
     */
    public static void sumOfDigits() {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println(sumOfDigitsInternal(array));
    }

    public static String sumOfDigitsInternal(int[] array) {
        int sum = 0;

        for (int j = 0; j < array.length; j++) {
            int num = array[j];
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
        }
        return "Сумма всеx цифр: " + sum;
    }
}
