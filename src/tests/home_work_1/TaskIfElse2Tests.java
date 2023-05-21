package tests.home_work_1;

import home_work_1.TaskIfElse2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskIfElse2Tests {

    TaskIfElse2 welcom2 = new TaskIfElse2();

    @Test
    public void welcom_VasyaInput() {
        String result = welcom2.welcom("Вася");
        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал", result);
    }

    @Test
    public void welcom_AnastasiaInput() {
        String result = welcom2.welcom("Анастасия");
        Assertions.assertEquals("Я тебя так долго ждал", result);
    }

    @Test
    public void welcom_OtherInput() {
        String result = welcom2.welcom("Леша");
        Assertions.assertEquals("Добрый день, а вы кто?", result);
    }

    @Test
    public void welcom_WrongInput_ReturnsErrorResult() {
        String result = welcom2.welcom("a1");
        Assertions.assertEquals("Так имена не пишут!", result);
    }

}
