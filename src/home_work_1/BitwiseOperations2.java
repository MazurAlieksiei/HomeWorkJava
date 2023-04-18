package home_work_1;

public class BitwiseOperations2 {
    public static void main(String[] args) {

        double firstNumber = 42.5;
        double secondNumber = 5.0;
        double firstResult = firstNumber & secondNumber;
        double secondResult = firstNumber | secondNumber;

        System.out.println("Результат побитного 'И': " + firstResult);
        System.out.println("Результат побитного 'ИЛИ': " + secondResult);
    }
}
// побитовые операторы не моугт быть примененены к типам с плавающей точкой (вещестьвенным типам: float и double)
// в результате такого кода, мы получим ошибку "невозможно применение оператора к вещественному типу"