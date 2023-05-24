package tests.home_work_2.arrays;

import home_work_2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTests {
    WhileOperation operation = new WhileOperation();

    @Test
    public void elementsOutput() {
        int[] baseArray = {5, 11, 4, 9, 45, 0, 33, 57, 1};
        int[] expected = {5, 11, 4, 9, 45, 0, 33, 57, 1};
        operation.elementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, baseArray);
    }

    @Test
    public void everySecondElement() {
        int[] baseArray = {5, 11, 4, 9, 45, 0, 33, 57, 1};
        int[] expected = {11, 9, 0, 57};
        int[] methodResult = operation.everySecondElement(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }

    @Test
    public void reversElementsOutput() {
        int[] baseArray = {5, 11, 4, 9, 45, 0, 33, 57, 1};
        int[] expected = {1, 57, 33, 0, 45, 9, 4, 11, 5};
        int[] methodResult = operation.reversElementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }
}
