package tests.home_work_1;

import home_work_1.TaskAverage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskAverageTests {

    @Test
    public void getAvaregeNumber_NormalInput_ReturnsValidResult() {
        int result = TaskAverage.getAvaregeNumber(1, 2, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void getAvaregeNumber_NegativeNumbersInput_ReturnsValidResult() {
        int result = TaskAverage.getAvaregeNumber(-1, -2, -3);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void getAvaregeNumber_SameNumbersInput_ReturnsValidResult() {
        int result = TaskAverage.getAvaregeNumber(2, 2, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void getAvaregeNumber_SameTwoNumbersInput_ReturnsValidResult() {
        int result = TaskAverage.getAvaregeNumber(2, 1, 1);
        Assertions.assertEquals(1, result);
    }
}
