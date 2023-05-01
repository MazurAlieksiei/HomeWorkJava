package home_work_2.loops;

public class MultiplicationTableFirstTry {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5 ; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t" );
            }
            System.out.println();
        }
        System.out.println();
         for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9 ; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t" );
            }
            System.out.println();
        }
    }
}
