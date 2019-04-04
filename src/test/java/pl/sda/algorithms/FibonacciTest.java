package pl.sda.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void shouldCreateValidFibonacciSequenceForGivenElements() {
        // given
        int n = 4;
        int[] result = new int[n];

        // when
        Fibonacci.fibRec(result, n);

        // then
        // #1
        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
        Assertions.assertEquals(1, result[2]);
        Assertions.assertEquals(2, result[3]);

        // #2
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 2}, result);
    }

    @Test
    public void shouldGetProperFibonacciValueForGivenElement() {
        // given
        int n = 4;

        // when
        int result = Fibonacci.fibonacci(n);

        // then
        Assertions.assertEquals(2, result);
        Assertions.assertNotSame(3, result);
    }
}
