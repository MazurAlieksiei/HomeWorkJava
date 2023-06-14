package home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод добавления данных.
     *
     * @param item Элемент, необходимый к добавлению.
     * @return Возвращает номер позиции в которую был вставлен элемент.
     */
    int add(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return addToOverflow(item);
    }

    /**
     * Метод получения сохраненные объектов в поле.
     *
     * @param index Индекс элемента сохраненного объект.
     * @return Возвращает предварительно сохранённый объект.
     */
    T get(int index) {
        if (!(index >= 0 && index <= data.length - 1)) {
            return null;
        }
        return data[index];
    }

    /**
     * Метод получения массива данных.
     *
     * @return Возвращает массив данных из поля.
     */
    T[] getItems() {
        return data;
    }

    /**
     * Метод удаления элемента из поля по индексу.
     *
     * @param index Индекс элемента, который необходимо удалить.
     * @return Возвращает true, если объект удален. Возвращает false, если объект не удален.
     */
    boolean delete(int index) {
        if (!(index >= 0 && index <= data.length - 1)) {
            return false;
        }

        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOfRange(data, 0, data.length - 1);
        return true;
    }

    /**
     * Метод удаления элемента из поля.
     *
     * @param item Элемент, который необходимо удалить.
     * @return Возвращает true, если элемент удален. Возвращает false, если элемент не удален либо передано null.
     */
    boolean delete(T item) {
        if (item == null) {
            return false;
        }
        // проходим по массиву, если элемент найден - удаляем
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Метод вывода строкового представления содержимого указанного массива. Если элемент массива null - ячейка не выводится.
     *
     * @return Строковое представление массива.
     */
    @Override
    public String toString() {
        T[] tmpArray = Arrays.copyOf(data, data.length);
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] == null) {
                for (int j = i; j < tmpArray.length - 1; j++) {
                    tmpArray[j] = tmpArray[j + 1];
                }
                tmpArray = Arrays.copyOfRange(tmpArray, 0, tmpArray.length - 1);
            }
        }
        return Arrays.toString(tmpArray);
    }

    /**
     * Метод сортировки данных контейнера, с использованием переданной реализации сравнения.
     *
     * @param comparator реализация сравнения из ПЕРЕДАННОГО объекта comparator.
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) { // цикл перебирает элементы массива с конца
                if (comparator.compare(data[j - 1], data[j]) > 0) { // // если текущий элемент меньше предыдущего, меняем их местами
                    swap(data, j - 1, j);
                }
            }
        }
    }

    /**
     * Метод сортировки данных контейнера. Использует реализацию сравнения хранимых объектов.
     *
     * @param container Контейнер.
     */
    public static void sort(DataContainer<? extends Comparable> container) {
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = container.data.length - 1; j > i; j--) { // цикл перебирает элементы массива с конца
                if (container.data[j - 1].compareTo(container.data[j]) > 0) { // // если текущий элемент меньше предыдущего, меняем их местами
                    swap(container.data, j - 1, j);
                }
            }
        }
    }

    /**
     * Метод сортировки данных контейнера. Используется переданная реализация сравнения.
     *
     * @param container  Контейнер.
     * @param comparator Реализация сравнения.
     * @param <E>        Тип элементов контейнера.
     */
    public static <E> void sort(DataContainer<E> container, Comparator<E> comparator) {
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = container.data.length - 1; j > i; j--) { // цикл перебирает элементы массива с конца
                if (comparator.compare(container.data[j - 1], container.data[j]) > 0) { // // если текущий элемент меньше предыдущего, меняем их местами
                    swap(container.data, j - 1, j);
                }
            }
        }
    }

    /**
     * Метод добавления данных в переполненное поле.
     *
     * @param item Данные, необходимые к добавлению.
     * @return Возвращает номер позиции в которую были вставлены данные.
     */
    private int addToOverflow(T item) {
        T[] newrray = Arrays.copyOf(data, data.length + 1);

        for (int i = 0; i < data.length; i++) {
            newrray[i] = data[i];
        }
        newrray[newrray.length - 1] = item;
        data = newrray;
        return newrray.length - 1;
    }

    /**
     * Метод перестановки элементов массива.
     *
     * @param array  Массив элементов.
     * @param index1 Индекс первого элемента.
     * @param index2 Индекс второго элемента.
     * @param <U>    Тип элементов массива.
     */
    private static <U> void swap(U[] array, int index1, int index2) {
        U change = array[index1]; // переменная, в которую сохраняется значение
        array[index1] = array[index2];
        array[index2] = change;
    }
}
