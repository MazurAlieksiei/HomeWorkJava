package tests.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTests {
    CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());

    @Test
    public void division() {
        double a = 28;
        double b = 5;
        Assertions.assertEquals(5.6, calculator.division(a, b));
    }

    @Test
    public void multiplication() {
        double a = 15;
        double b = 7;
        Assertions.assertEquals(105, calculator.multiplication(a, b));
    }

    @Test
    public void subtracting() {
        double a = 15;
        double b = 7;
        Assertions.assertEquals(8, calculator.subtracting(a, b));
    }

    @Test
    public void adding() {
        double a = 4.1;
        double b = calculator.multiplication(15, 7);
        Assertions.assertEquals(109.1, calculator.adding(a, b));
    }

    @Test
    public void degrading() {
        double a = calculator.division(28, 5);
        Assertions.assertEquals(31.359999999999996, calculator.degrading(a, 2));
    }

    @Test
    public void abs() {
        double a = -4;
        Assertions.assertEquals(4, calculator.abs(a));
    }

    @Test
    public void squareRoot() {
        double a = 16;
        Assertions.assertEquals(4, calculator.squareRoot(a));
    }

    @Test
    public void save() {
        calculator.abs(-4);
        calculator.save();
        Assertions.assertEquals(4, calculator.load());
    }

    @Test
    public void load() {
        calculator.abs(-4);
        calculator.save();
        Assertions.assertEquals(4, calculator.load());
        Assertions.assertEquals(0, calculator.load());
    }
}
