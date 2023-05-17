package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double firstOperation = calculator.multiplication(15, 7);

        double secondOperation = calculator.adding(4.1, firstOperation);

        double thirdOperation = calculator.division(28, 5);

        double forthOperation = calculator.adding(secondOperation, thirdOperation);

        double result = calculator.degrading(forthOperation, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }
}
