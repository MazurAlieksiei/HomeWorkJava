package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double tmp = calculator.adding(calculator.adding(4.1, calculator.multiplication(15, 7)), calculator.division(28, 5));
        double result = calculator.degrading(tmp, 2);

        System.out.println(result);
    }
}
