package home_work_2.arrays;


public class ForOperation implements IArraysOperation {

    @Override
    public void elementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива циклом 'for' ");

        for (int i = 0; i < baseArray.length; i++) {
            System.out.print(baseArray[i] + " ");
        }
    }

    @Override
    public int[] everySecondElement(int[] baseArray) {
        System.out.println("Вывод каждого второго элемента массива циклом 'for' ");
        int[] temp = new int[baseArray.length / 2]; // массив, куда будет сохранен каждый второй элемент исходного массива. Размер - исходный / 2, т.к. елементов в 2 раза меньше

        for (int i = 1, j = 0; i < baseArray.length; i += 2, j++) {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
        }

        return temp;
    }

    @Override
    public int[] reversElementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'for' ");
        int[] temp = new int[baseArray.length]; // массив, куда будет сохранены элементы исходного массива в обратном порядке

        for (int i = baseArray.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
        }

        return temp;
    }
}
