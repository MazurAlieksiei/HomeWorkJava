package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();
        int[] userArray = new int[arraySize];
        System.out.print("Введите элементы массива через пробел: ");

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = in.nextInt();
        }
        return userArray;
    }


    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(maxValueExclusion);
        }
        return randomArray;
    }

    /**
     * Метод поиска индекса элемента, на основании переданных параметров.
     * @param array массив для поиска
     * @param element элемент, индекс которого необходимо узнать
     * @return индекс элемента в массиве. Если элемент не найден вернет -1
     */
    public static int find(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

