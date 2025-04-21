package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalcIsPositiveTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/isPositive.csv")
    void testIsPositive(long val, boolean expected) {
        assertEquals(expected, calculator.isPositive(val));
    }
}
