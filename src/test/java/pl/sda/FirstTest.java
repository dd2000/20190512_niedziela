package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    public void shouldTwoEqualTwo() {
       Assertions.assertEquals(2, 2);
    }

    @Test
    public void shouldThreeEqualsThree() {
        Assertions.assertEquals(3, 3);
    }
}
