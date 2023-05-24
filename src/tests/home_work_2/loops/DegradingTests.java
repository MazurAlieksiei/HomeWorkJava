package tests.home_work_2.loops;

import home_work_2.loops.Degrading;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DegradingTests {
    @ParameterizedTest
    @CsvSource({"18.0, 5, 1889568.0", "7.5, 2, 56.25", "9.4, 8, 6.095689385410819E7", "14, 3, 2744"})

    public void degradingMethod(double a, int b, double result) {
        double methodResult = Degrading.degradingMethod(a, b);
        Assertions.assertEquals(result, methodResult);
    }

    @ParameterizedTest
    @CsvSource({"18.0, 5, 18.0 ^ 5 = 1889568.0", "7.5, 2, 7.5 ^ 2 = 56.25",
            "9.4, 8, 9.4 ^ 8 = 6.095689385410819E7", "14, 3, 14 ^ 3 = 2744"})
    public void degradingString() {
        String a = "18.0";
        String b = "5";
        String result = Degrading.degradingString(a, b);
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", result);
    }
}
