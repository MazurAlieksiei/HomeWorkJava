package home_work_2.arrays;


public class WhileOperation implements IArraysOperation {
    @Override
    public void elementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива циклом 'while' ");

        int i = 0;
        while (i < baseArray.length) {
            System.out.print(baseArray[i] + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        }
    }

    @Override
    public int[] everySecondElement(int[] baseArray) {
        System.out.println("Вывод каждого второго элемента массива циклом 'while' ");
        int[] temp = new int[baseArray.length / 2]; // массив, куда будет сохранен каждый второй элемент исходного массива. Размер - исходный / 2, т.к. елементов в 2 раза меньше

        int i = 1;
        int j = 0;
        while (i < baseArray.length) {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
            i += 2;
            j++;
        }

        return temp;
    }

    @Override
    public int[] reversElementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'while' ");
        int[] temp = new int[baseArray.length]; // массив, куда будет сохранены элементы исходного массива в обратном порядке

        int i = baseArray.length - 1;
        int j = 0;
        while (i >= 0) {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
            i--;
            j++;
        }

        return temp;
    }
}
