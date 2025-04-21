package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSinTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(doubles = {0.0, Math.PI})
    void testSin(double a) {
        assertEquals(Math.sin(a), calculator.sin(a), 0.0001);
    }
}
