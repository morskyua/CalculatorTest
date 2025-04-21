package junit.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcDivTest extends BaseTest {
    @ParameterizedTest
    @CsvSource({"6, 3, 2", "10, 2, 5"})
    void testDivLong(long a, long b, long expected) {
        assertEquals(expected, calculator.div(a, b));
    }

    @Test
    void testDivLongByZero() {
        assertThrows(NumberFormatException.class, () -> calculator.div(10L, 0L));
    }

    @ParameterizedTest
    @CsvSource({"6.0, 3.0, 2.0", "10.0, 2.0, 5.0"})
    void testDivDouble(double a, double b, double expected) {
        assertEquals(expected, calculator.div(a, b), 0.0001);
    }

    @Test
    public void divDoubleZeroTest() {
        assertThrows(NumberFormatException.class, () -> calculator.div(2.0, 0.0));
    }

}
