package tests.home_work_1;

import home_work_1.TaskOddNumbers;
import home_work_1.TaskYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskYearTests {

    @Test
    public void getYear_SpecialYearInput_ReturnsSpecialMessage() {
        String result = TaskYear.getYear(1980);
        Assertions.assertEquals("Високосный год", result);
    }

    @Test
    public void getYear_RegularYearInput_ReturnsSpecialMessage() {
        String result = TaskYear.getYear(2023);
        Assertions.assertEquals("Обычный год", result);
    }
}