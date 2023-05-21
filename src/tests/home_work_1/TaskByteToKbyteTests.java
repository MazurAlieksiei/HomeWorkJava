package tests.home_work_1;

import home_work_1.TaskAverage;
import home_work_1.TaskByteToKbyte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskByteToKbyteTests {

    @Test
    public void getByteToKbyte_NormalToByteInput_ResturnsValidResult() {
        String result = TaskByteToKbyte.getByteToKbyte(2, "b");
        Assertions.assertEquals(2 + " Килобайты = " + (2 * 1024) + " байт", result);
    }

    @Test
    public void getByteToKbyte_NormalToKbyteInput_ResturnsValidResult() {
        String result = TaskByteToKbyte.getByteToKbyte(2, "k");
        Assertions.assertEquals(2 + " байт = " + (2 / 1024.0) + " Килобайт", result);
    }

    @Test
    public void getByteToKbyte_OtherLetterInput_ResturnsValidResult() {
        String result = TaskByteToKbyte.getByteToKbyte(2, "с");
        Assertions.assertEquals("Неправильный ввод", result);
    }
}
