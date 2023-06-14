package home_work_5;

import java.util.Comparator;

public class IntegerNumbersComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
