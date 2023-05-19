package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator iCalculator =
                new CalculatorWithCounterAutoDecorator(
                        new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double tmp = iCalculator.adding(iCalculator.adding(4.1, iCalculator.multiplication(15, 7)), iCalculator.division(28, 5));
        double result = iCalculator.degrading(tmp, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " + ((CalculatorWithCounterAutoDecorator) iCalculator).getCountOperation());
    }

}
