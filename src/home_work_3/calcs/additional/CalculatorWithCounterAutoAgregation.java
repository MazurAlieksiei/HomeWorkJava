package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculator;
    private long count = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double division(double firstNumber, double secondNumber) {
        count++;
        return calculator.division(firstNumber, secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        count++;
        return calculator.multiplication(firstNumber, secondNumber);
    }

    public double subtracting(double firstNumber, double secondNumber) {
        count++;
        return calculator.subtracting(firstNumber, secondNumber);
    }

    public double adding(double firstNumber, double secondNumber) {
        count++;
        return calculator.adding(firstNumber, secondNumber);
    }

    public double degrading(double number, int degree) {
        count++;
        return calculator.degrading(number, degree);
    }

    public double abs(double number) {
        count++;
        return calculator.abs(number);
    }

    public double squareRoot(double number) {
        count++;
        return calculator.squareRoot(number);
    }

    public long getCountOperation() {
        return count;
    }
}
