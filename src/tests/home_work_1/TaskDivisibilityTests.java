package tests.home_work_1;

import home_work_1.TaskAverage;
import home_work_1.TaskDivisibility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskDivisibilityTests {

    @Test
    public void getDivisibility_ZeroInput_ReturnsErrorResult() {
        String result = TaskDivisibility.getDivisibility(0, 2);
        Assertions.assertEquals("Ноль вводить нельзя!", result);
    }

    @Test
    public void getDivisibility_NormalInput_ReturnsValidResult() {
        String result = TaskDivisibility.getDivisibility(2, 2);
        Assertions.assertEquals((2 + " делится на " + 2 + "\n"
                + "Частное: " + (2 / 2)), result);
    }

    @Test
    public void getDivisibility_WithResidueInput_ReturnsValidResult() {
        String result = TaskDivisibility.getDivisibility(3, 2);
        Assertions.assertEquals((3 + " не делится на " + 2 + "\n"
                + "Остаток: " + (3 % 2) + "\n"
                + "Частное: " + (3 / 2)), result);
    }
}
