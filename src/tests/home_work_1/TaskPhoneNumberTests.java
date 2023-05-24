package tests.home_work_1;

import home_work_1.TaskPhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskPhoneNumberTests {

    @Test
    public void createPhoneNumber_NormalInput_ReturnsValidResult() {
        String result = TaskPhoneNumber.createPhoneNumber("0 1 2 3 4 5 6 7 8 9");
        Assertions.assertEquals("(012) 345-6789", result);
    }

    @Test
    public void createPhoneNumber_WrongLengthInput_ReturnsErrorResult() {
        String result = TaskPhoneNumber.createPhoneNumber("0 1 2 3 4 5");
        Assertions.assertEquals("Вы ввели неправильное количество цифр!", result);
    }
}
