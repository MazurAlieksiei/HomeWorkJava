package home_work_2.loops;

public class MultiplicationTableFirstTry {

    /**
     * Метод формирования таблицы умножения.
     *
     * @param from Число, с которого формируется таблица умножения.
     * @param to   Число, до которого формируется таблица умножения.
     * @return Возвращает таблицу умножения.
     */
    public static String printRow(int from, int to) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder(result);
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                stringBuilder.append(j + " * " + i + " = " + (i * j) + "\t");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
