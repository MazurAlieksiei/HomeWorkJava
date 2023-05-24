package tests.home_work_2.arrays;

import home_work_2.arrays.ArrayTasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTasksTests {

    @Test
    public void sumOddElementsInternal() {
        int[] array = {1, 2, 3, 4, 5, 6};
        String result = ArrayTasks.sumOddElementsInternal(array);
        Assertions.assertEquals("Сумма равна: " + 12, result);
    }

    @Test
    public void maxFromOddElementsInternal() {
        int[] array = {1, 50, 20, 41, 78, 3};
        String result = ArrayTasks.maxFromOddElementsInternal(array);
        Assertions.assertEquals("Максимальный элемент: " + 78, result);
    }

    @Test
    public void lessArithmeticMeanInternal() {
        int[] array = {1, 3, 20, 2, 13, 5};
        int result = ArrayTasks.lessArithmeticMeanInternal(array);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void twoSmallestElementsInternal() {
        int[] array = {60, 3, 11, 2, 37, 8, 23, 1};
        String result = ArrayTasks.twoSmallestElementsInternal(array);
        Assertions.assertEquals("Первый элемент: " + 1 + "\nВторой элемент: " + 2, result);
    }

    @Test
    public void arrayCompressionInternal() {
        int[] array = {60, 31, 1, 2, 5, 9, 12, 33, 58, 3, 15, 88, 0};
        int hBorder = 2;
        int lBorder = 10;
        int[] expectedArray = {60, 31, 1, 2, 5, 9, 12, 33, 58, 3, 15, 88, 0};
        int[] result = ArrayTasks.arrayCompressionInternal(array, hBorder, lBorder);
        Assertions.assertArrayEquals(expectedArray, result);
    }

    @Test
    public void sumOfDigitsInternal() {
        int[] array = {60, 31, 1, 22, 58};
        String result = ArrayTasks.sumOfDigitsInternal(array);
        Assertions.assertEquals("Сумма всеx цифр: " + 28, result);
    }
}
