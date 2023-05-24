package home_work_2.arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class ArraysIteration {
    public static void main(String[] args) {

        elementsOutput();
        System.out.println("\n"); // для большей информативности вывода в консоли - два пробела
        everySecondElement();
        System.out.println("\n");
        reversElementsOutput();

    }

    /**
     * Метод выводит элементы массива. Размер массива и его элементы вводятся пользователем.
     */
    public static void elementsOutput() {
        for (int element : arrayFromConsole()) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] array = arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.print(element + " "); //можно сразу писать array[i] в print, без введения новой переменной
        }
        System.out.println();

        array = arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            int element = array[i];
            System.out.print(element + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        }
        System.out.println();

        array = arrayFromConsole();
        i = 0;
        do {
            int element = array[i];
            System.out.print(element + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        } while (i < array.length);
    }

    /**
     * Метод выводит каждый второй элемент массива. Размер массива и его элементы вводятся пользователем.
     */
    public static void everySecondElement() {
        int[] array = arrayFromConsole();
        for (int i = 1; i < array.length; i += 2) {
            int element = array[i];
            System.out.print(element + " ");
        }
        System.out.println();

        array = arrayFromConsole();
        int i = 1;
        while (i < array.length) {
            int element = array[i];
            System.out.print(element + " ");
            i += 2;
        }
        System.out.println();

        array = arrayFromConsole();
        i = 1;
        do {
            int element = array[i];
            System.out.print(element + " ");
            i += 2;
        } while (i < array.length);
        System.out.println();

        array = arrayFromConsole();
        int index = 0;
        for (int element : array) {
            // int index = find(array, element); // добавил дополнительный метод в ArrayUtils, для поиска индекса элемента массива
            if (index % 2 != 0) {
                System.out.print(element + " ");
            }
            index++;
        }
    }

    /**
     * Метод выводит элементы массива в обратном порядке.
     * Размер массива и его элементы вводятся пользователем.
     */
    public static void reversElementsOutput() {
        int[] array = arrayFromConsole();
        for (int i = array.length - 1; i >= 0; i--) {
            int element = array[i];
            System.out.print(element + " ");
        }
        System.out.println();

        array = arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            int element = array[i];
            System.out.print(element + " ");
            i--;
        }
        System.out.println();

        array = arrayFromConsole();
        i = array.length - 1;
        do {
            int element = array[i];
            System.out.print(element + " ");
            i--;
        } while (i >= 0);
        System.out.println();

        array = arrayFromConsole();
        int index = array.length;
        for (int element : array) {

            System.out.print(index + " ");
            index--;
        }
    }
}
