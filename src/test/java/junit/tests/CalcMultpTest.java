package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcMultpTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"2, 3, 6", "-2, 3, -6", "0, 1000, 0"})
    void testMultLong(long a, long b, long expected) {
        assertEquals(expected, calculator.mult(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2.5, 2.0, 5.0", "1.7, 1.7, 2.0", "-1.5, 2.0, -3.0"})
    void testMultDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.mult(a, b), 0.0001);
    }
}
