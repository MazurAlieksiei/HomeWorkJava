package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        int firstOperation = 15 * 7; // результат - 105
        double secondOperation = 28D / 5; // результат - 5.6
        double thirdOperation = 4.1 + firstOperation + secondOperation; // результат - 114.69999999999999
        double forthOperation = thirdOperation * thirdOperation; // результат - 13156.089999999997
        //double expression = Math.pow(4.1 + (15 * 7) + ((double) 28 / 5), 2);

        //System.out.println(expression);

        System.out.println(forthOperation);
    }
}
