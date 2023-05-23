package tests.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryDecoratorTests {
    ICalculator iCalculator =
            new CalculatorWithCounterAutoDecorator(
                    new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

    @Test
    public void division() {
        double a = 28;
        double b = 5;
        Assertions.assertEquals(5.6, iCalculator.division(a, b));
    }

    @Test
    public void multiplication() {
        double a = 15;
        double b = 7;
        Assertions.assertEquals(105, iCalculator.multiplication(a, b));
    }

    @Test
    public void subtracting() {
        double a = 15;
        double b = 7;
        Assertions.assertEquals(8, iCalculator.subtracting(a, b));
    }

    @Test
    public void adding() {
        double a = 4.1;
        double b = iCalculator.multiplication(15, 7);
        Assertions.assertEquals(109.1, iCalculator.adding(a, b));
    }

    @Test
    public void degrading() {
        double a = iCalculator.division(28, 5);
        Assertions.assertEquals(31.359999999999996, iCalculator.degrading(a, 2));
    }

    @Test
    public void abs() {
        double a = -4;
        Assertions.assertEquals(4, iCalculator.abs(a));
    }

    @Test
    public void squareRoot() {
        double a = 16;
        Assertions.assertEquals(4, iCalculator.squareRoot(a));
    }

    @Test
    public void save() {
        ICalculator calculatorWithMemory = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calculatorWithMemory.abs(-4);
        ((CalculatorWithMemoryDecorator) calculatorWithMemory).save();
        Assertions.assertEquals(4, ((CalculatorWithMemoryDecorator) calculatorWithMemory).load());
    }

    @Test
    public void load() {
        ICalculator calculatorWithMemory = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calculatorWithMemory.abs(-4);
        ((CalculatorWithMemoryDecorator) calculatorWithMemory).save();
        double savedOperationResult = ((CalculatorWithMemoryDecorator) calculatorWithMemory).load();
        Assertions.assertEquals(4, savedOperationResult);
        Assertions.assertEquals(0, ((CalculatorWithMemoryDecorator) calculatorWithMemory).load());
    }
}
