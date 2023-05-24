package tests.home_work_2.loops;

import home_work_2.loops.FactorialRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialRecursionTests {

    @ParameterizedTest
    @CsvSource({"5 , 120",
            "10, 3628800",
            "8, 40320"})
    public void getFactorialRecursion(long number, long expected) {
        long result = FactorialRecursion.getFactorialRecursion(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void stringForGetFactorialRecursion() {
        long number = 5;
        String result = FactorialRecursion.stringForGetFactorialRecursion(number);
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = ", result);
    }

    @Test
    public void stringForGetFactorialRecursion_MineInput1() {
        long number = 10;
        String result = FactorialRecursion.stringForGetFactorialRecursion(number);
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = ", result);
    }

    @Test
    public void stringForGetFactorialRecursion_MineInput2() {
        long number = 8;
        String result = FactorialRecursion.stringForGetFactorialRecursion(number);
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = ", result);
    }

    @ParameterizedTest
    @CsvSource({"-3 , Введено отрицательное число",
            "1f, Не корректный ввод!"})
    public void getFactorialResult_WrongInput_ReturnErrorResult(String number, String expected) {
        String result = FactorialRecursion.getFactorialResult(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getFactorialResult_NullInput_ReturnErrorResult() {
        String number = "";
        String result = FactorialRecursion.getFactorialResult(number);
        Assertions.assertEquals("Не корректный ввод!", result);
    }
}
