package pl.sda.sorting.bubble;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] table = randomTable(10, 10, 100);
//        System.out.println(Arrays.toString(table));
        long start = System.currentTimeMillis();
        sort(table, true);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(table));
        System.out.println(end - start + "ms");
    }

    public static void sort(int[] table, boolean ascending) {
        int n = table.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int k = 0; k < n - i - 1; k++) {
                if (ascending && table[k] > table[k + 1]) {
                    swap(table, k);
                    count++;
                }
                if (!ascending && table[k] < table[k + 1]) {
                    swap(table, k);
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
    }

    private static void swap(int[] tab, int i) {
        int value = tab[i];
        tab[i] = tab[i + 1];
        tab[i + 1] = value;
    }

    private static int[] randomTable(int n, int a, int b) {
        int[] tab = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = random.nextInt(b - a + 1) + a;
        }
        return tab;
    }
}
