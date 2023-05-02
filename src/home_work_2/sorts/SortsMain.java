package home_work_2.sorts;

import java.util.Arrays;

import home_work_2.utils.SortsUtils;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;
import static home_work_2.utils.ArrayUtils.arrayRandom;

public class SortsMain {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print(Arrays.toString(array1) + " -> ");
        SortsUtils.sort(array1);
        System.out.println(Arrays.toString(array1));
        array1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print(Arrays.toString(array1) + " -> ");
        SortsUtils.shake(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println();

        int[] array2 = new int[]{1, 1, 1, 1};
        System.out.print(Arrays.toString(array2) + " -> ");
        SortsUtils.sort(array2);
        System.out.println(Arrays.toString(array2));
        array2 = new int[]{1, 1, 1, 1};
        System.out.print(Arrays.toString(array2) + " -> ");
        SortsUtils.sort(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println();

        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        System.out.print(Arrays.toString(array3) + " -> ");
        SortsUtils.sort(array3);
        System.out.println(Arrays.toString(array3));
        array3 = new int[]{9, 1, 5, 99, 9, 9};
        System.out.print(Arrays.toString(array3) + " -> ");
        SortsUtils.sort(array3);
        System.out.println(Arrays.toString(array3));

        System.out.println();

        int[] array4 = new int[]{};
        System.out.print(Arrays.toString(array4) + " -> ");
        SortsUtils.sort(array4);
        System.out.println(Arrays.toString(array4));
        array4 = new int[]{};
        System.out.print(Arrays.toString(array4) + " -> ");
        SortsUtils.sort(array4);
        System.out.println(Arrays.toString(array4));

        System.out.println();

        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(array5) + " -> ");
        SortsUtils.sort(array5);
        System.out.println(Arrays.toString(array5));
        array5 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(array5) + " -> ");
        SortsUtils.sort(array5);
        System.out.println(Arrays.toString(array5));

        System.out.println();

        int size = 50;
        int maxValueExclusion = 100;
        int[] array6 = arrayRandom(size, maxValueExclusion);
        System.out.print(Arrays.toString(array6) + " -> ");
        SortsUtils.sort(array6);
        System.out.println(Arrays.toString(array6));
        array6 = arrayRandom(size, maxValueExclusion);
        System.out.print(Arrays.toString(array6) + " -> ");
        SortsUtils.sort(array6);
        System.out.println(Arrays.toString(array6));

        System.out.println();

        int[] array7 = arrayFromConsole();
        System.out.print(Arrays.toString(array7) + " -> ");
        SortsUtils.sort(array7);
        System.out.println(Arrays.toString(array7));
        array7 = arrayFromConsole();
        System.out.print(Arrays.toString(array7) + " -> ");
        SortsUtils.sort(array7);
        System.out.println(Arrays.toString(array7));

    }
}
