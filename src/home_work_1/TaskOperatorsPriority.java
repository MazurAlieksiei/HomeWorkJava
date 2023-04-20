package home_work_1;

public class TaskOperatorsPriority {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 2;
        System.out.println(b + c / a); // сначала выполняется деление 2/8=0, а потом сложение 5+0=5
        System.out.println((b + c) / a); // сначала выполняется выражение в скобках 5+2=7, а потом деление 7/8=0
        System.out.println((b + c++) / a); // сначала выполняется выражение в скобках 5+2=7, затем с+=1, а потом деление 7/8=0
        c = 2; // присваиваем изначальное значение к переменной, так как выше она стала 3
        System.out.println((b + c++) / --a); // сначала выполняется выражение в скобках 5+2=7,затем с+=1, потом деление a-=1, и в конце 7/7=0
        a = 8;// присваиваем изначальное значение к переменной, так как выше она стала 7
        c = 2;
        System.out.println((b * c >> c++) / --a);
        /*сначала выполняется выражение в скобках 5*2=10,затем с+=1,
        потом сдвиг битов числа 10 (0101) на с=3 -> получаем число 1 (0001),
        а в конце деление 1/7=0 */
        a = 8;
        c = 2;
        System.out.println((b + 7 > 20 ? 68 : 22 * c >> c++) / --a);
        /* сначала выполняется тернарный оператор, выражение1 дает false, поэтому выражение два не возвращается,
        а переходим к выражению3. Сначала 22*2= 44, потом сдвиг битов вправо на 2 00101100 -> 00001011 (число 11),
         затем с+=1 (3 стало) . Далее a-=1 и в конце 11/7=0 */
        a = 8;
        c = 2;
        //System.out.println((b + 7 > 20 ? 68 >= 68 : 22 * c >> c++) / --a);
        /* данная операция невозможна, так как выражение2 и выражение3 тернарного оператора должны возвращать
        значения одинакового типа (или совместимого). У нас выражение2 тип - boolean, а выражение3 тип - int */
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
        /* первое выражение даст true, второе - false, условный оператор "И" выдаст false,
        так как одно из двух выражений false */
        System.out.println(true && false); // условный оператор "И" выдаст false, так как одно из двух выражений false
    }
}
