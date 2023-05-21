package tests.home_work_1;

import home_work_1.TaskSleepOrNot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSleepOrNotTests {

    @Test
    public void sleepIn_TrueAndTrueInput() {
        boolean result = TaskSleepOrNot.sleepIn(true, true);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void sleepIn_TrueAndFalseInput() {
        boolean result = TaskSleepOrNot.sleepIn(true, false);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void sleepIn_FalseAndTrueInput() {
        boolean result = TaskSleepOrNot.sleepIn(false, true);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void sleepIn_FalseAndFalseInput() {
        boolean result = TaskSleepOrNot.sleepIn(false, false);
        Assertions.assertEquals(false, result);
    }
}
