package pl.sda.stack.arraystack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void shouldPushElementToEmptyStack() {
        // given
        Stack<String> stack = new Stack<>();
        Assertions.assertTrue(stack.isEmpty());

        // when
        stack.push("abc");

        // then
        Assertions.assertFalse(stack.isEmpty());
    }
}
