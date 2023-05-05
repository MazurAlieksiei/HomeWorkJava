package home_work_2.arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation {

    @Override
    public void elementsOutput() {
        System.out.println("Вывод элементов массива циклом 'for' ");
        int[] array = arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.print(element + " ");
        }
    }

    @Override
    public void everySecondElement() {
        System.out.println("Вывод каждого второго элемента массива циклом 'for' ");
        int[] array = arrayFromConsole();
        for (int i = 1; i < array.length; i += 2) {
            int element = array[i];
            System.out.print(element + " ");
        }
    }

    @Override
    public void reversElementsOutput() {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'for' ");
        int[] array = arrayFromConsole();
        for (int i = array.length - 1; i >= 0; i--) {
            int element = array[i];
            System.out.print(element + " ");
        }
    }
}
