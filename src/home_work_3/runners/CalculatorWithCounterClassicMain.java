package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        CalculatorWithCounterClassic counter = new CalculatorWithCounterClassic();

        double firstOperation = calculator.multiplication(15, 7);
        counter.incrementCountOperation();

        double secondOperation = calculator.adding(4.1, firstOperation);
        counter.incrementCountOperation();

        double thirdOperation = calculator.division(28, 5);
        counter.incrementCountOperation();

        double forthOperation = calculator.adding(secondOperation, thirdOperation);
        counter.incrementCountOperation();

        double result = calculator.degrading(forthOperation, 2);
        counter.incrementCountOperation();

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " + counter.getCountOperation());
    }


}
