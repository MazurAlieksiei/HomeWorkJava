package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());

        calculator.multiplication(15, 7);
        calculator.save();

        calculator.adding(4.1, calculator.load());
        calculator.save();

        calculator.adding(calculator.load(), calculator.division(28, 5));
        calculator.save();

        System.out.println(calculator.degrading(calculator.load(), 2));
    }
}
