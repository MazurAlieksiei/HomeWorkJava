package home_work_2.arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void elementsOutput() {
        System.out.println("Вывод элементов массива циклом 'foreach' ");
        for (int element : arrayFromConsole()) {
            System.out.print(element + " ");
        }
    }

    @Override
    public void everySecondElement() {
        System.out.println("Вывод каждого второго элемента массива циклом 'foreach' ");
        int[] array = arrayFromConsole();
        int index = 0;
        for (int element : array) {
            if (index % 2 != 0) {
                System.out.print(element + " ");
            }
            index++;
        }
    }

    @Override
    public void reversElementsOutput() {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'foreach' ");
        int[] array = arrayFromConsole();
        int index = array.length;
        for (int element : array) {

            System.out.print(index + " ");
            index--;
        }
    }
}
