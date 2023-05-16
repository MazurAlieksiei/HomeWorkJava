package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;

    @Override
    public double division(double firstNumber, double secondNumber) {
        count++;
        return super.division(firstNumber, secondNumber);
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        count++;
        return super.multiplication(firstNumber, secondNumber);
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        count++;
        return super.subtracting(firstNumber, secondNumber);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        count++;
        return super.adding(firstNumber, secondNumber);
    }

    @Override
    public double degrading(double number, int degree) {
        count++;
        return super.degrading(number, degree);
    }

    @Override
    public double abs(double number) {
        count++;
        return super.abs(number);
    }

    @Override
    public double squareRoot(double number) {
        count++;
        return super.squareRoot(number);
    }

    /**
     * Метод получения значения использования калькулятора.
     *
     * @return Возвращает количество использований калькулятора.
     */
    public long getCountOperation() {
        return count;
    }
}
