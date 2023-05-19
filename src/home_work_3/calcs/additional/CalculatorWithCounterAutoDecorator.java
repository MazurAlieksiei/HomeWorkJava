package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private ICalculator calculator;
    private long count = 0;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        count++;
        return calculator.division(firstNumber, secondNumber);
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        count++;
        return calculator.multiplication(firstNumber, secondNumber);
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        count++;
        return calculator.subtracting(firstNumber, secondNumber);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        count++;
        return calculator.adding(firstNumber, secondNumber);
    }

    @Override
    public double degrading(double number, int degree) {
        count++;
        return calculator.degrading(number, degree);
    }

    @Override
    public double abs(double number) {
        count++;
        return calculator.abs(number);
    }

    @Override
    public double squareRoot(double number) {
        count++;
        return calculator.squareRoot(number);
    }

    public ICalculator getCalculator() {
        return this.calculator;
    }

    public long getCountOperation() {
        return count;
    }
}
