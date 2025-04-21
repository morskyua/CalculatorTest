package junit.tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalcIsNegativeTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/isNegative.csv")
    void testIsNegative(long val, boolean expected) {
        assertEquals(expected, calculator.isNegative(val));
    }
}
