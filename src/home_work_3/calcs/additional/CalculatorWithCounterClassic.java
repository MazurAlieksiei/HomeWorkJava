package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    /**
     * Метод увеличения счетчика использования калькулятора.
     */
    public void incrementCountOperation() {
        count++;
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
