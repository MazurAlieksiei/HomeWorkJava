package tests.home_work_1;

import home_work_1.TaskOddNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskOddNumbersTests {

    @Test
    public void getOddNumber_NormalInput_ReturnsValidResult() {
        int result = TaskOddNumbers.getOddNumber(1, 2);
        Assertions.assertEquals(1, result);
    }
}
