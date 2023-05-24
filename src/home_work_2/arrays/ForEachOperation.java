package home_work_2.arrays;


public class ForEachOperation implements IArraysOperation {

    @Override
    public void elementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива циклом 'foreach' ");
        for (int element : baseArray) {
            System.out.print(element + " ");
        }
    }

    @Override
    public int[] everySecondElement(int[] baseArray) {
        System.out.println("Вывод каждого второго элемента массива циклом 'foreach' ");
        int[] temp = new int[baseArray.length / 2]; // массив, куда будет сохранен каждый второй элемент исходного массива. Размер - исходный / 2, т.к. елементов в 2 раза меньше

        int index = 0;
        int j = 0;
        for (int element : baseArray) {
            if (index % 2 != 0) {
                temp[j] = element;
                j++;
                System.out.print(element + " ");
            }
            index++;
        }

        return temp;
    }

    @Override
    public int[] reversElementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'foreach' ");
        int[] temp = new int[baseArray.length]; // массив, куда будет сохранены элементы исходного массива в обратном порядке

        int index = baseArray.length - 1;
        int j = 0;
        for (int element : baseArray) {
            temp[j] = baseArray[index];
            System.out.print(baseArray[index] + " ");
            index--;
            j++;
        }

        return temp;
    }
}
