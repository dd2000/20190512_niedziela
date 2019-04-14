package pl.sda.sorting.bubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void shouldSortArrayInAscendingOrder() {
        // given
        int[] tab = new int[]{3, 1, 9, 2, 7};

        // when
        BubbleSort.sort(tab, true);

        // then
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 7, 9}, tab);
    }
}
