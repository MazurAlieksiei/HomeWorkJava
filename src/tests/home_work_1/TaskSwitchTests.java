package tests.home_work_1;

import home_work_1.TaskSwitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSwitchTests {

    TaskSwitch welcom3 = new TaskSwitch();

    @Test
    public void welcom_VasyaInput() {
        String result = welcom3.welcom("Вася");
        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал", result);
    }

    @Test
    public void welcom_AnastasiaInput() {
        String result = welcom3.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", result);
    }

    @Test
    public void welcom_OtherInput() {
        String result = welcom3.welcom("Леша");
        Assertions.assertEquals("Добрый день, а вы кто?", result);
    }

    @Test
    public void welcom_WrongInput_ReturnsErrorResult() {
        String result = welcom3.welcom("a1");
        Assertions.assertEquals("Так имена не пишут!", result);
    }
}
