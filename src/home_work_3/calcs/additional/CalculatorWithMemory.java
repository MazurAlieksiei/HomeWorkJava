package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double lastOperationResult;

    private double savedOperationResult;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double firstNumber, double secondNumber) {
        lastOperationResult = calculator.division(firstNumber, secondNumber);
        return lastOperationResult;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        lastOperationResult = calculator.multiplication(firstNumber, secondNumber);
        return lastOperationResult;
    }

    public double subtracting(double firstNumber, double secondNumber) {
        lastOperationResult = calculator.subtracting(firstNumber, secondNumber);
        return lastOperationResult;
    }

    public double adding(double firstNumber, double secondNumber) {
        lastOperationResult = calculator.adding(firstNumber, secondNumber);
        return lastOperationResult;
    }

    public double degrading(double number, int degree) {
        lastOperationResult = calculator.degrading(number, degree);
        return lastOperationResult;
    }

    public double abs(double number) {
        lastOperationResult = calculator.abs(number);
        return lastOperationResult;
    }

    public double squareRoot(double number) {
        lastOperationResult = calculator.squareRoot(number);
        return lastOperationResult;
    }

    public void save() {
        savedOperationResult = lastOperationResult;
    }

    public double load() {
//        double temp = savedOperationResult;
//        savedOperationResult = 0;
//        return temp;
        return savedOperationResult;
    }
}
