package home_work_2.arrays;

import java.util.Arrays;
import java.util.List;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;
import static home_work_2.utils.ArrayUtils.find;

public class ArraysIteration {
    public static void main(String[] args) {

        elementsOutput ();
        System.out.println("\n"); // для большей информативности вывода в консоли - два пробела
        everySecondElement();
        System.out.println("\n");
        reversElementsOutput();

    }

    public static void elementsOutput() {
//        for (int element : arrayFromConsole()){
//            System.out.print(element + " ");
//        }

//        int[] array = arrayFromConsole();
//        for (int i = 0; i < array.length; i++){
//            int element = array[i];
//            System.out.print(element + " ");
//        }
//        int[] array = arrayFromConsole();
//        int i = 0;
//        while (i < array.length){
//            int element = array[i];
//            System.out.print(element + " ");
//            i++;
//        }
        int[] array = arrayFromConsole();
        int i = 0;
        do {
            int element = array[i];
            System.out.print(element + " ");
            i++;
        } while (i < array.length);
    }

    public static void everySecondElement(){
//        int[] array = arrayFromConsole();
//        for (int i = 1; i < array.length; i+= 2){
//            int element = array[i];
//            System.out.print(element + " ");
//        }
//        int[] array = arrayFromConsole();
//        int i = 1;
//        while (i < array.length) {
//            int element = array[i];
//            System.out.print(element + " ");
//            i += 2;
//        }
//        int[] array = arrayFromConsole();
//        int i = 1;
//        do {
//            int element = array[i];
//            System.out.print(element + " ");
//            i+=2;
//        } while (i < array.length);


        int[] array = arrayFromConsole();
        int index = 0;
        for (int element : array) {
//            int index = find(array, element); // добавил дополнительный метод в ArrayUtils, для поиска индекса элемента массива
            if (index % 2 != 0){
                System.out.print(element + " ");
            }
            index++;
        }
    }

    public static void reversElementsOutput (){
//        int[] array = arrayFromConsole();
//        for (int i = array.length -1; i >= 0; i--){
//            int element = array[i];
//            System.out.print(element + " ");
//        }
//        int[] array = arrayFromConsole();
//        int i = array.length - 1;
//        while (i >= 0){
//            int element = array[i];
//            System.out.print(element + " ");
//            i--;
//        }
//        int[] array = arrayFromConsole();
//        int i = array.length - 1;
//        do {
//            int element = array[i];
//            System.out.print(element + " ");
//            i--;
//        } while (i >= 0);
        int[] array = arrayFromConsole();
        int index = array.length;
        for (int element : array) {

            System.out.print(index + " ");
            index--;
        }
    }
}
