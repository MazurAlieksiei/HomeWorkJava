package home_work_2.utils;

public class SortsUtils {
    /**
     * Метод "пузырьковой" сортировки массива. Элементы массива располагаются от меньшего к большему
     *
     * @param arr передаваемый для сортировки массив
     */
    public static void sort(int[] arr) {
        int lenOfSorting = arr.length - 1;

        for (int i = 0; i < lenOfSorting; i++) {
            for (int j = lenOfSorting; j > i; j--) { // цикл перебирает элементы массива с конца
                if (arr[j - 1] > arr[j]) { // // если текущий элемент меньше предыдущего, меняем их местами
                    int change = arr[j - 1]; // переменная, в которую сохраняется значение
                    arr[j - 1] = arr[j];
                    arr[j] = change;
                }
            }
        }
    }

    /**
     * Метод "шейкерной" сортировки массива. Элементы массива располагаются от меньшего к большему
     *
     * @param arr передаваемый для сортировки массив
     */
    public static void shake(int[] arr) {
        int lenOfSorting = arr.length - 1;
        int leftBorder = 0; // левая граница сортируемого массива
        int rightBorder = lenOfSorting - 1; //  правая граница сортируемого массива
        int changes = 1; // маркер изменений в цикле

        /*  Цикл выполняется пока левая граница не сомкнётся с правой
         и пока в массиве имеются перемещения */
        while ((leftBorder < rightBorder) && changes > 0) {
            changes = 0;
            for (int i = leftBorder; i < rightBorder; i++) {  //двигаемся слева направо
                if (arr[i] > arr[i + 1]) { // если следующий элемент меньше текущего, меняем их местами
                    int tmp = arr[i]; // переменная, в которую сохраняются значения
                    arr[i] = arr[i + 1]; // присваиваем текущему элементу значение следующего элементаhn
                    arr[i + 1] = tmp; // записываем в следующий элемент значение текущего элемента
                    changes = 1;      // маркер изменений в цикле
                }
            }
            rightBorder--; // сдвигаем правую границу на предыдущий элемент
            for (int i = rightBorder; i > leftBorder; i--) { //двигаемся справа налево
                if (arr[i - 1] > arr[i]) { // если предыдущий элемент больше текущего, меняем их местами
                    int tmp = arr[i]; // переменная, в которую сохраняются значения
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    changes = 1;    // маркер изменений в цикле
                }
            }
            leftBorder++; // сдвигаем левую границу на следующий элемент
        }
    }
}
