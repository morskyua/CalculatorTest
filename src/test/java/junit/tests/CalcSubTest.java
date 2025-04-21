package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSubTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"5, 3, 2", "3, 5, -2", "0, 0, 0"})
    void testSubLong(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5.5, 2.5, 3.0", "3.0, 5.0, -2.0", "0.0, 0.0, 0.0"})
    void testSubDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.sub(a, b), 0.0001);
    }
}
