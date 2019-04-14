package pl.sda.sorting.bubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void shouldSortArrayInAscendingOrder() throws Exception {
        // given
        int[] tab = new int[]{3, 1, 9, 2, 7};

        // when
        BubbleSort.sort(tab);

        // then
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 7, 9}, tab);
    }

    @Test
    public void shouldThrowsException() {
        // given
        int[] tab = null;

        // then
        Assertions.assertThrows(TableIsNullException.class, () -> BubbleSort.sort(tab));
    }
}
