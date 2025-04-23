package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTgTest extends BaseTest {
    @ParameterizedTest
    @ValueSource(doubles = {0.0, 1.0, -1.0})
    void testTg(double a) {
        assertEquals(Math.tan(a), calculator.tg(a), 0.0001);
    }
}
