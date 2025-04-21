package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSumTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"1, 2, 3", "-5, 3, -2", "0, 0, 0"})
    void testSumLong(long a, long b, long expected) {
        assertEquals(expected, calculator.sum(a, b));
    }
    @ParameterizedTest
    @CsvSource({"1.5, 2.5, 4.0", "-5.0, 3.0, -2.0", "0.0, 0.0, 0.0"})
    void testSumDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.sum(a, b), 0.0001);
    }
}
