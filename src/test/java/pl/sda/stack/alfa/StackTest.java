package pl.sda.stack.alfa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void shouldAddValueToStack() {
        // given
        Stack stack = new Stack();
        int a = 5;

        // when
        stack.push(a);

        // then
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(new Integer(5), stack.peek());
    }

    @Test
    public void shouldReturnNullIfStackIsEmpty() {
        // given
        Stack stack = new Stack();

        // when
        Integer result = stack.pop();

        // then
        Assertions.assertNull(result);
    }
}
