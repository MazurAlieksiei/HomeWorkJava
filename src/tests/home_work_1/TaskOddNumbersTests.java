package tests.home_work_1;

import home_work_1.TaskOddNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskOddNumbersTests {

    @Test
    public void getOddNumber_NormalInput_ReturnsValidResult() {
        int result = TaskOddNumbers.getOddNumber(1, 2);
        Assertions.assertEquals(1, result);
    }

//    @Test
//    public void getOddNumber_TwoOddNumbersInput_ReturnsFirstNumber(){
//        int result = TaskOddNumbers.getOddNumber(1,1);
//        Assertions.assertEquals(1, result);
//    }
//
//    @Test
//    public void getOddNumber_TwoEvenNumbersInput_ReturnsErrorResult(){
//        int result = TaskOddNumbers.getOddNumber(2,2);
//        Assertions.assertEquals(0, result);
//    }
//
//    @Test
//    public void getOddNumber_TwoZeroInput_ReturnsErrorResult(){
//        int result = TaskOddNumbers.getOddNumber(0,0);
//        Assertions.assertEquals(0, result);
//    }
//
//    @Test
//    public void getOddNumber_CharInput_ReturnsErrorResult(){
//        int result = TaskOddNumbers.getOddNumber(1,'a');
//        Assertions.assertEquals(0, result);
//    }
}
