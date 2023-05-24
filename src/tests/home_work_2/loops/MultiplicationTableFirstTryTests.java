package tests.home_work_2.loops;

import home_work_2.loops.MultiplicationTableFirstTry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTableFirstTryTests {

    @Test
    public void printRow() {
        int from = 1;
        int to = 5;
        String result = MultiplicationTableFirstTry.printRow(from, to);
        Assertions.assertEquals("1 * 1 = 1\t2 * 1 = 2\t3 * 1 = 3\t4 * 1 = 4\t5 * 1 = 5\t\n" +
                "1 * 2 = 2\t2 * 2 = 4\t3 * 2 = 6\t4 * 2 = 8\t5 * 2 = 10\t\n" +
                "1 * 3 = 3\t2 * 3 = 6\t3 * 3 = 9\t4 * 3 = 12\t5 * 3 = 15\t\n" +
                "1 * 4 = 4\t2 * 4 = 8\t3 * 4 = 12\t4 * 4 = 16\t5 * 4 = 20\t\n" +
                "1 * 5 = 5\t2 * 5 = 10\t3 * 5 = 15\t4 * 5 = 20\t5 * 5 = 25\t\n" +
                "1 * 6 = 6\t2 * 6 = 12\t3 * 6 = 18\t4 * 6 = 24\t5 * 6 = 30\t\n" +
                "1 * 7 = 7\t2 * 7 = 14\t3 * 7 = 21\t4 * 7 = 28\t5 * 7 = 35\t\n" +
                "1 * 8 = 8\t2 * 8 = 16\t3 * 8 = 24\t4 * 8 = 32\t5 * 8 = 40\t\n" +
                "1 * 9 = 9\t2 * 9 = 18\t3 * 9 = 27\t4 * 9 = 36\t5 * 9 = 45\t\n" +
                "1 * 10 = 10\t2 * 10 = 20\t3 * 10 = 30\t4 * 10 = 40\t5 * 10 = 50\t\n", result);
    }

    @Test
    public void printRow_MineInput() {
        int from = 6;
        int to = 10;
        String result = MultiplicationTableFirstTry.printRow(from, to);
        Assertions.assertEquals("6 * 1 = 6\t7 * 1 = 7\t8 * 1 = 8\t9 * 1 = 9\t10 * 1 = 10\t\n" +
                "6 * 2 = 12\t7 * 2 = 14\t8 * 2 = 16\t9 * 2 = 18\t10 * 2 = 20\t\n" +
                "6 * 3 = 18\t7 * 3 = 21\t8 * 3 = 24\t9 * 3 = 27\t10 * 3 = 30\t\n" +
                "6 * 4 = 24\t7 * 4 = 28\t8 * 4 = 32\t9 * 4 = 36\t10 * 4 = 40\t\n" +
                "6 * 5 = 30\t7 * 5 = 35\t8 * 5 = 40\t9 * 5 = 45\t10 * 5 = 50\t\n" +
                "6 * 6 = 36\t7 * 6 = 42\t8 * 6 = 48\t9 * 6 = 54\t10 * 6 = 60\t\n" +
                "6 * 7 = 42\t7 * 7 = 49\t8 * 7 = 56\t9 * 7 = 63\t10 * 7 = 70\t\n" +
                "6 * 8 = 48\t7 * 8 = 56\t8 * 8 = 64\t9 * 8 = 72\t10 * 8 = 80\t\n" +
                "6 * 9 = 54\t7 * 9 = 63\t8 * 9 = 72\t9 * 9 = 81\t10 * 9 = 90\t\n" +
                "6 * 10 = 60\t7 * 10 = 70\t8 * 10 = 80\t9 * 10 = 90\t10 * 10 = 100\t\n", result);
    }
}
