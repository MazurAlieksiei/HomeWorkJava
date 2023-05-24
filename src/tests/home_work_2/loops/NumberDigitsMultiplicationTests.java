package tests.home_work_2.loops;

import home_work_2.loops.NumberDigitsMultiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class NumberDigitsMultiplicationTests {

    @ParameterizedTest
    @CsvSource({"181232375, " + "\'[1, 8, 1, 2, 3, 2, 3, 7, 5]\'",
            "435698133, " + "\'[4, 3, 5, 6, 9, 8, 1, 3, 3]\'"})
    public void sumDigits(String number, String expected) {
        long[] methodResult = NumberDigitsMultiplication.sumDigits(number);
        String result = Arrays.toString(methodResult);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"181232375, 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080",
            "435698133, 4 * 3 * 5 * 6 * 9 * 8 * 1 * 3 * 3 = 233280"})
    public void stringFormating(String number, String expected) {
        String result = NumberDigitsMultiplication.stringFormating(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"181232375, 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080",
            "435698133, 4 * 3 * 5 * 6 * 9 * 8 * 1 * 3 * 3 = 233280"})
    public void numberDigitsMultiplicationCheckAndReturn(String number, String expected) {
        String result = NumberDigitsMultiplication.numberDigitsMultiplicationCheckAndReturn(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({" 1.0 , Введено не целое число",
            "-3 , Введено отрицательное число",
            "1f, Введено не число"})
    public void numberDigitsMultiplicationCheckAndReturn_WrongInput_ReturnErrorResult(String number, String expected) {
        String result = NumberDigitsMultiplication.numberDigitsMultiplicationCheckAndReturn(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void numberDigitsMultiplicationCheckAndReturn_NullInput_ReturnErrorResult() {
        String number = "";
        String result = NumberDigitsMultiplication.numberDigitsMultiplicationCheckAndReturn(number);
        Assertions.assertEquals("Не корректный ввод!", result);
    }
}
