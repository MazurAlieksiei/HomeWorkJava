package tests.home_work_2.arrays;

import home_work_2.arrays.ForEachOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForEachOperationTests {
    ForEachOperation operation = new ForEachOperation();

    @Test
    public void elementsOutput() {
        int[] baseArray = {9, 77, 6, 25, 34, 28, 6, 71};
        int[] expected = {9, 77, 6, 25, 34, 28, 6, 71};
        operation.elementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, baseArray);
    }

    @Test
    public void everySecondElement() {
        int[] baseArray = {9, 77, 6, 25, 34, 28, 6, 71};
        int[] expected = {77, 25, 28, 71};
        int[] methodResult = operation.everySecondElement(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }

    @Test
    public void reversElementsOutput() {
        int[] baseArray = {9, 77, 6, 25, 34, 28, 6, 71};
        int[] expected = {71, 6, 28, 34, 25, 6, 77, 9};
        int[] methodResult = operation.reversElementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }
}
