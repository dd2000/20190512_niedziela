package pl.sda.stack.beta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void shouldAddValueToStack() {
        // given
        Stack<Integer> stack = new Stack<>();
        Integer a = 5;

        // when
        stack.push(a);

        // then
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(a, stack.peek());
    }

    @Test
    public void shouldReturnNullIfStackIsEmpty() {
        // given
        Stack<Integer> stack = new Stack<>();

        // when
        Integer result = stack.pop();

        // then
        Assertions.assertNull(result);
    }
}
