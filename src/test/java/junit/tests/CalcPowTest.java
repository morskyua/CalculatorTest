package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcPowTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({"2.0, 3.0, 8.0", "5.0, 0.0, 1.0", "4.0, 2.5, 16.0"})
    void testPow(double a, double b, double expected) {
        assertEquals(expected, calculator.pow(a, b), 0.0001);
    }
}
