package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calculatorWithOperator =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        CalculatorWithCounterAutoChoiceAgregation calculatorWithMathCopy =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        CalculatorWithCounterAutoChoiceAgregation calculatorWithMathExtends =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());


        double firstOperation = calculatorWithOperator.multiplicationWithOperator(15, 7);

        double secondOperation = calculatorWithOperator.addingWithOperator(4.1, firstOperation);

        double thirdOperation = calculatorWithOperator.divisionWithOperator(28, 5);

        double forthOperation = calculatorWithOperator.addingWithOperator(secondOperation, thirdOperation);

        double result = calculatorWithOperator.degradingWithOperator(forthOperation, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " +
                calculatorWithOperator.getCountOperationWithOperator());


        firstOperation = calculatorWithMathCopy.multiplicationWithMathCopy(15, 7);

        secondOperation = calculatorWithMathCopy.addingWithMathCopy(4.1, firstOperation);

        thirdOperation = calculatorWithMathCopy.divisionWithMathCopy(28, 5);

        forthOperation = calculatorWithMathCopy.addingWithMathCopy(secondOperation, thirdOperation);

        result = calculatorWithMathCopy.degradingWithMathCopy(forthOperation, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " +
                calculatorWithMathCopy.getCountOperationWithMathCopy());


        firstOperation = calculatorWithMathExtends.multiplicationWithMathExtends(15, 7);

        secondOperation = calculatorWithMathExtends.addingWithMathExtends(4.1, firstOperation);

        thirdOperation = calculatorWithMathExtends.divisionWithMathExtends(28, 5);

        forthOperation = calculatorWithMathExtends.addingWithMathExtends(secondOperation, thirdOperation);

        result = calculatorWithMathExtends.degradingWithMathExtends(forthOperation, 2);

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " +
                calculatorWithMathExtends.getCountOperationWithMathExtends());
    }
}
