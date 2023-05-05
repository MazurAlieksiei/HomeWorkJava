package home_work_2.arrays;

import home_work_2.arrays.IArraysOperation;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public void elementsOutput() {
        System.out.println("Вывод элементов массива циклом 'do ... while' ");
        int[] array = arrayFromConsole();
        int i = 0;
        do {
            int element = array[i];
            System.out.print(element + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        } while (i < array.length);
    }

    @Override
    public void everySecondElement() {
        System.out.println("Вывод каждого второго элемента массива циклом 'do ... while' ");
        int[] array = arrayFromConsole();
        int i = 1;
        do {
            int element = array[i];
            System.out.print(element + " ");
            i+=2;
        } while (i < array.length);
    }

    @Override
    public void reversElementsOutput() {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'do ... while' ");
        int[] array = arrayFromConsole();
        int i = array.length - 1;
        do {
            int element = array[i];
            System.out.print(element + " ");
            i--;
        } while (i >= 0);
    }
}
