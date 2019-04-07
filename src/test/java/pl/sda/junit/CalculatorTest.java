package pl.sda.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void shouldAddNumbers() {
        // given
        int a = 3;
        int b = 7;

        // when
        int result = Calculator.add(a, b);

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldDivideNumbers() {
        // given
        int a = 10;
        int b = 2;

        // when
        int result = Calculator.divide(a, b);

        // then
        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldCheckArray() {
        // given
        int[] arr = new int[4];

        // when

        // then
        Assertions.assertTrue(arr != null);
        Assertions.assertTrue(arr.length > 0);
        Assertions.assertEquals(0, arr[0]);
    }
}
