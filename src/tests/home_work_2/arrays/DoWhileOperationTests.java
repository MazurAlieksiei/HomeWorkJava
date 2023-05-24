package tests.home_work_2.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTests {

    DoWhileOperation operation = new DoWhileOperation();

    @Test
    public void elementsOutput() {
        int[] baseArray = {1, 3, 20, 2, 13, 5, 7, 3, 88, 34};
        int[] expected = {1, 3, 20, 2, 13, 5, 7, 3, 88, 34};
        operation.elementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, baseArray);
    }

    @Test
    public void everySecondElement() {
        int[] baseArray = {1, 3, 20, 2, 13, 5, 7, 3, 88, 34};
        int[] expected = {3, 2, 5, 3, 34};
        int[] methodResult = operation.everySecondElement(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }

    @Test
    public void reversElementsOutput() {
        int[] baseArray = {1, 3, 20, 2, 13, 5, 7, 3, 88, 34};
        int[] expected = {34, 88, 3, 7, 5, 13, 2, 20, 3, 1};
        int[] methodResult = operation.reversElementsOutput(baseArray);
        Assertions.assertArrayEquals(expected, methodResult);
    }
}
