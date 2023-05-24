package tests.home_work_2.loops;

import home_work_2.loops.MultiplyLong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplyLongTests {

    @ParameterizedTest
    @CsvSource({"1, 3,Число перед переполнением: 4052555153018976267 Число после переполнения: -6289078614652622815",
            "1, 188,Число перед переполнением: 1560496482665168896 Число после переполнения: -1774566438301073408",
            "1, -19,Число перед переполнением: 799006685782884121 Число после переполнения: 3265617043834753317",
            "1, 23,Число перед переполнением: 504036361936467383 Число после переполнения: -6853907749170801807",
            "1, -333,Число перед переполнением: -454056225438947877 Число после переполнения: 3626770481493230113"})
    public void multiply(long a, int multiplier, String result) {

        String methodResult = MultiplyLong.multiply(a, multiplier);
        Assertions.assertEquals(result, methodResult);

    }
}
