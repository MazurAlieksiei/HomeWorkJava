package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Метод возведения в степень.
     *
     * @param number Число, возводимое в степень (дробное положительное).
     * @param degree Число, являющиеся степенью (целое).
     * @return Возвращает результат возведения в степень.
     */
    @Override
    public double degrading(double number, int degree) {
        double result = Math.pow(number, degree);
        return result;
    }

    /**
     * Метод вычисления модуля числа.
     *
     * @param number Число, модуль которого необходимо найти.
     * @return Возвращает модуль числа.
     */
    @Override
    public double abs(double number) {
        double result = Math.abs(number);
        return result;
    }

    /**
     * Метод вычисления корня из числа.
     *
     * @param number Число, из которого необходимо извлечь корень.
     * @return Возвращает результат извлечения корня из числа.
     */
    @Override
    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }
}
