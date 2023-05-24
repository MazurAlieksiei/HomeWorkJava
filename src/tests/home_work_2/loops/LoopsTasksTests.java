package tests.home_work_2.loops;

import home_work_2.loops.LoopsTasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoopsTasksTests {

    @ParameterizedTest
    @CsvSource({"12345678, Максимальная цифра числа: 8",
            "7539100,  Максимальная цифра числа: 9",
            "6532104,  Максимальная цифра числа: 6"})
    public void largestDigit(int number, String expected) {
        String result = LoopsTasks.largestDigit(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"1234, " + "\'четных 2, нечетных 2\'",
            "7539100,  " + "\'четных 2, нечетных 5\'",
            "6532104,  " + "\'четных 4, нечетных 3\'"})
    public void evenAndOddNumbers(int number, String expected) {
        String result = LoopsTasks.evenAndOddNumbers(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"5, " + "\'1 2 3 5 8 \'",
            "3, " + "\'1 2 3 \'",
            "10, " + "\'1 2 3 5 8 13 21 34 55 89 \'"})
    public void fibonacciSeries(int numberOfElements, String expected) {
        String result = LoopsTasks.fibonacciSeries(numberOfElements);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"0, 10, 2, " + "\'0 2 4 6 8 10 \'",
            "0, 10, 3, " + "\'0 3 6 9 \'",
            "0, 20, 4, " + "\'0 4 8 12 16 20 \'"})
    public void rangeOfNumbers(int minValue, int maxValue, int step, String expected) {
        String result = LoopsTasks.rangeOfNumbers(minValue, maxValue, step);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"12345, 54321", "6789, 9876", "543201, 102345"})
    public void reversNumber(int number, int expected) {
        int result = LoopsTasks.reversNumber(number);
        Assertions.assertEquals(expected, result);
    }

}
