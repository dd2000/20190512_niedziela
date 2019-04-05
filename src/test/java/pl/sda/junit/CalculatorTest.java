package pl.sda.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void shouldComputeNumbers() {
        // given
        int a = 3;
        int b = 7;

        // when
        int result = Calculator.add(a, b);

        // then
        Assertions.assertEquals(10, result);
    }
}
