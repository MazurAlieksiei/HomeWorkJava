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

    public static int find(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

