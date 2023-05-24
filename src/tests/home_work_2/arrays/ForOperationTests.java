package tests.home_work_2.arrays;

import home_work_2.arrays.ForOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForOperationTests {
    ForOperation operation = new ForOperation();

    @Test
    public void elementsOutput() {
        int[] baseArray = {7, 66, 3, 11, 34, 19, 6, 2};
        int[] expected = {7, 66, 3, 11, 34, 19, 6, 2};
        operation.elementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, baseArray);
    }

    @Test
    public void everySecondElement() {
        int[] baseArray = {7, 66, 3, 11, 34, 19, 6, 2};
        int[] expected = {66, 11, 19, 2};
        int[] methodResult = operation.everySecondElement(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }

    @Test
    public void reversElementsOutput() {
        int[] baseArray = {7, 66, 3, 11, 34, 19, 6, 2};
        int[] expected = {2, 6, 19, 34, 11, 3, 66, 7};
        int[] methodResult = operation.reversElementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }
}
