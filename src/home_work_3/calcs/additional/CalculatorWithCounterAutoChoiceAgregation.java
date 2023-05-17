package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    private long count = 0;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculatorWithMathExtends = calculator;
    }

    public double divisionWithOperator(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithOperator.division(firstNumber, secondNumber);
    }

    public double multiplicationWithOperator(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithOperator.multiplication(firstNumber, secondNumber);
    }

    public double subtractingWithOperator(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithOperator.subtracting(firstNumber, secondNumber);
    }

    public double addingWithOperator(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithOperator.adding(firstNumber, secondNumber);
    }

    public double degradingWithOperator(double number, int degree) {
        count++;
        return calculatorWithOperator.degrading(number, degree);
    }

    public double absWithOperator(double number) {
        count++;
        return calculatorWithOperator.abs(number);
    }

    public double squareRootWithOperator(double number) {
        count++;
        return calculatorWithOperator.squareRoot(number);
    }

    public long getCountOperationWithOperator() {
        return count;
    }


    public double divisionWithMathCopy(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathCopy.division(firstNumber, secondNumber);
    }

    public double multiplicationWithMathCopy(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathCopy.multiplication(firstNumber, secondNumber);
    }

    public double subtractingWithMathCopy(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathCopy.subtracting(firstNumber, secondNumber);
    }

    public double addingWithMathCopy(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathCopy.adding(firstNumber, secondNumber);
    }

    public double degradingWithMathCopy(double number, int degree) {
        count++;
        return calculatorWithMathCopy.degrading(number, degree);
    }

    public double absWithMathCopy(double number) {
        count++;
        return calculatorWithMathCopy.abs(number);
    }

    public double squareRootWithMathCopy(double number) {
        count++;
        return calculatorWithMathCopy.squareRoot(number);
    }

    public long getCountOperationWithMathCopy() {
        return count;
    }


    public double divisionWithMathExtends(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathExtends.division(firstNumber, secondNumber);
    }

    public double multiplicationWithMathExtends(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathExtends.multiplication(firstNumber, secondNumber);
    }

    public double subtractingWithMathExtends(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathExtends.subtracting(firstNumber, secondNumber);
    }

    public double addingWithMathExtends(double firstNumber, double secondNumber) {
        count++;
        return calculatorWithMathExtends.adding(firstNumber, secondNumber);
    }

    public double degradingWithMathExtends(double number, int degree) {
        count++;
        return calculatorWithMathExtends.degrading(number, degree);
    }

    public double absWithMathExtends(double number) {
        count++;
        return calculatorWithMathExtends.abs(number);
    }

    public double squareRootWithMathExtends(double number) {
        count++;
        return calculatorWithMathExtends.squareRoot(number);
    }

    public long getCountOperationWithMathExtends() {
        return count;
    }
}
