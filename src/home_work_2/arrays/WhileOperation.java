package home_work_2.arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation {
    @Override
    public void elementsOutput() {
        System.out.println("Вывод элементов массива циклом 'while' ");
        int[] array = arrayFromConsole();
        int i = 0;
        while (i < array.length) {
            int element = array[i];
            System.out.print(element + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        }
    }

    @Override
    public void everySecondElement() {
        System.out.println("Вывод каждого второго элемента массива циклом 'while' ");
        int[] array = arrayFromConsole();
        int i = 1;
        while (i < array.length) {
            int element = array[i];
            System.out.print(element + " ");
            i += 2;
        }
    }

    @Override
    public void reversElementsOutput() {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'while' ");
        int[] array = arrayFromConsole();
        int i = array.length - 1;
        while (i >= 0) {
            int element = array[i];
            System.out.print(element + " ");
            i--;
        }
    }
}
