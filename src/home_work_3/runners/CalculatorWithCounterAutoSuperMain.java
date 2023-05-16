package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double firstOperation = calculator.multiplication(15, 7);

        double secondOperation = calculator.adding(4.1, firstOperation);

        double thirdOperation = calculator.division(28, 5);

        double forthOperation = calculator.adding(secondOperation, thirdOperation);

        double result = calculator.degrading(forthOperation, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }
}
