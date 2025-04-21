package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcCosTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(doubles = {0.0, Math.PI / 2})
    void testCos(double a) {
        assertEquals(Math.sin(a), calculator.cos(a), 0.0001);
    }
}
