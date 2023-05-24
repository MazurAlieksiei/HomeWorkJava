package home_work_2.arrays;


public class DoWhileOperation implements IArraysOperation {


    @Override
    public void elementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива циклом 'do ... while' ");

        int i = 0;
        do {
            System.out.print(baseArray[i] + " "); //можно сразу писать array[i] в print, без введения новой переменной
            i++;
        } while (i < baseArray.length);
    }


    @Override
    public int[] everySecondElement(int[] baseArray) {
        System.out.println("Вывод каждого второго элемента массива циклом 'do ... while' ");
        int[] temp = new int[baseArray.length / 2]; // массив, куда будет сохранен каждый второй элемент исходного массива. Размер - исходный / 2, т.к. элементов в 2 раза меньше

        int i = 1;
        int j = 0;
        do {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
            i += 2;
            j++;
        } while (i < baseArray.length);

        return temp;
    }

    @Override
    public int[] reversElementsOutput(int[] baseArray) {
        System.out.println("Вывод элементов массива в обратном порядке циклом 'do ... while' ");
        int[] temp = new int[baseArray.length]; // массив, куда будет сохранены элементы исходного массива в обратном порядке

        int i = baseArray.length - 1;
        int j = 0;
        do {
            temp[j] = baseArray[i];
            System.out.print(baseArray[i] + " ");
            i--;
            j++;
        } while (i >= 0);

        return temp;
    }
}
