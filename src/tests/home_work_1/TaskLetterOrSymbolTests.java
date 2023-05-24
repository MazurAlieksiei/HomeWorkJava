package tests.home_work_1;

import home_work_1.TaskLetterOrSymbol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskLetterOrSymbolTests {

    @Test
    public void getLetterOrSymbol_InRightRangeInput_ReturnsLetterResult() {
        String result = TaskLetterOrSymbol.getLetterOrSymbol(77);
        Assertions.assertEquals("Это буква " + (char) 77, result);
    }

    @Test
    public void getLetterOrSymbol_InWrongRangeInput_ReturnsSymbolResult() {
        String result = TaskLetterOrSymbol.getLetterOrSymbol(1);
        Assertions.assertEquals("Это не буква, а символ " + (char) 1, result);
    }
}
