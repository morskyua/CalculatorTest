package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSqrtTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({"4, 2", "81, 9"})
    void testSqrt(double a, double res) {
        assertEquals(res, calculator.sqrt(a));
    }
}
