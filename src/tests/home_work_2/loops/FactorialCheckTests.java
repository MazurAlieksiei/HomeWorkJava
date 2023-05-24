package tests.home_work_2.loops;

import home_work_2.loops.FactorialCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialCheckTests {

    @ParameterizedTest
    @CsvSource({"5 , 1 * 2 * 3 * 4 * 5 = 120",
            "11, 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 = 39916800",
            "7, 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040"})
    public void getFactorialCasual(long number, String expected) {
        String result = FactorialCheck.getFactorialCasual(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-3 , Введено отрицательное число",
            "1f, Не корректный ввод!"})
    public void getFactorialResult_WrongInput_ReturnErrorResult(String number, String expected) {
        String result = FactorialCheck.getFactorialResult(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getFactorialResult_NullInput_ReturnErrorResult() {
        String number = "";
        String result = FactorialCheck.getFactorialResult(number);
        Assertions.assertEquals("Не корректный ввод!", result);
    }
}
