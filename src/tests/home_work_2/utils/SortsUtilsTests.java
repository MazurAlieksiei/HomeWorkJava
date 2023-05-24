package tests.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTests {

    @Test
    public void sort_NormalArrayInput() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_ReversArrayInput() {
        int[] array = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_SameElementsArrayInput() {
        int[] array = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_NullArrayInput() {
        int[] array = {};
        int[] expected = {};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_CasualArrayInput() {
        int[] array = {9, 1, 5, 99, 9, 9};
        int[] expected = {1, 5, 9, 9, 9, 99};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_Mine1ArrayInput() {
        int[] array = {60, 31, 1, 2, 5, 9, 12, 33, 58, 3, 15, 88, 0};
        int[] expected = {0, 1, 2, 3, 5, 9, 12, 15, 31, 33, 58, 60, 88};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_Mine2ArrayInput() {
        int[] array = {1, -3, 20, 2, -13, 5, 33, 0};
        int[] expected = {-13, -3, 0, 1, 2, 5, 20, 33};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void sort_Mine3ArrayInput() {
        int[] array = {1, -3, 0, 5, -13, -5, 22, 0, 19, -6, 11, 33};
        int[] expected = {-13, -6, -5, -3, 0, 0, 1, 5, 11, 19, 22, 33};
        SortsUtils.sort(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_NormalArrayInput() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_ReversArrayInput() {
        int[] array = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_SameElementsArrayInput() {
        int[] array = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_NullArrayInput() {
        int[] array = {};
        int[] expected = {};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_CasualArrayInput() {
        int[] array = {9, 1, 5, 99, 9, 9};
        int[] expected = {1, 5, 9, 9, 9, 99};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_Mine1ArrayInput() {
        int[] array = {60, 31, 1, 2, 5, 9, 12, 33, 58, 3, 15, 88, 0};
        int[] expected = {0, 1, 2, 3, 5, 9, 12, 15, 31, 33, 58, 60, 88};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_Mine2ArrayInput() {
        int[] array = {1, -3, 20, 2, -13, 5, 33, 0};
        int[] expected = {-13, -3, 0, 1, 2, 5, 20, 33};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    public void shake_Mine3ArrayInput() {
        int[] array = {1, -3, 0, 5, -13, -5, 22, 0, 19, -6, 11, 33};
        int[] expected = {-13, -6, -5, -3, 0, 0, 1, 5, 11, 19, 22, 33};
        SortsUtils.shake(array);
        Assertions.assertArrayEquals(expected, array);
    }
}
