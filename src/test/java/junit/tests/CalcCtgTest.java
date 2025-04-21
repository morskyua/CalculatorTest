package junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcCtgTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(doubles = {0.0, 1.0, -1.0})
    void testCtg(double a) {
        assertEquals(Math.tanh(a), calculator.ctg(a), 0.0001);
    }
}
