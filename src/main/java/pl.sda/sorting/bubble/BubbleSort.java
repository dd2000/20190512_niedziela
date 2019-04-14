package pl.sda.sorting.bubble;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int[] table = randomTable(100000, 1, 1000);
//        System.out.println(Arrays.toString(table));
        long start = System.currentTimeMillis();
        sort(table);
        long end = System.currentTimeMillis();
//        System.out.println(Arrays.toString(table));
        System.out.println(end - start + "ms");
    }

    public static void sort(int[] tab) throws TableIsNullException {
        if (tab == null) {
            throw new TableIsNullException();
        }
        int n = tab.length;
        long count = 0;
        do {
            int newn = 0;
            for (int i = 0; i < n - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    swap(tab, i);
                    count++;
                    newn = i + 1;
                }
            }
            n = newn;
        } while (n >= 1);
        System.out.println(count);
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
