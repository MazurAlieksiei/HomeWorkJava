package home_work_3.calcs.simple;

public class CalculatorWithOperator {

    /**
     * Метод деления чисел.
     *
     * @param firstNumber  Число, которое необходимо поделить.
     * @param secondNumber Число, на которое необходимо поделить.
     * @return Возвращает результат деления чисел.
     */
    public double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    /**
     * Метод умножения чисел.
     *
     * @param firstNumber  Число, которе необходимо умножить.
     * @param secondNumber Числи, на которое необходимо умножить.
     * @return Возвращает результат умножения чисел.
     */
    public double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    /**
     * Метод вычитания чисел.
     *
     * @param firstNumber  Число, из которого вычитается.
     * @param secondNumber Число, которое вычитают.
     * @return Возвращает результат вычитания левого числа от правого.
     */
    public double subtracting(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    /**
     * Метод сложения чисел.
     *
     * @param firstNumber  Число, к которому прибавляется.
     * @param secondNumber Число, которое прибавляется.
     * @return Возвращает результат сложения чисел.
     */
    public double adding(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    /**
     * Метод возведения в степень.
     *
     * @param number Число, возводимое в степень (дробное положительное).
     * @param degree Число, являющиеся степенью (целое).
     * @return Возвращает результат возведения в степень.
     */
    public double degrading(double number, int degree) {
        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }

    /**
     * Метод вычисления модуля числа.
     *
     * @param number Число, модуль которого необходимо найти.
     * @return Возвращает модуль числа.
     */
    public double abs(double number) {
        double result = (number <= 0.0D) ? 0.0D - number : number;
        return result;
    }

    /**
     * Метод вычисления корня из числа.
     *
     * @param number Число, из которого необходимо извлечь корень.
     * @return Возвращает результат извлечения корня из числа.
     */
    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }


}
