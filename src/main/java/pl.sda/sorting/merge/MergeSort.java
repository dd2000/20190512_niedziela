package pl.sda.sorting.merge;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] tab1 = randomTable(8, 1, 10);
        int[] tab2 = randomTable(7, 1, 10);

        sort(tab1, 0, tab1.length - 1);
        sort(tab2, 0, tab2.length - 1);

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
    }

    public static void sort(int[] tab, int low, int high) {
        if (low < high) {
            int m = (low + high) / 2;

            sort(tab, low, m);
            sort(tab, m + 1, high);

            int n1 = m - low + 1;
            int[] t1 = new int[n1];
            for (int i = 0; i < n1; ++i) {
                t1[i] = tab[low + i];
            }

            int n2 = high - m;
            int[] t2 = new int[n2];
            for (int j = 0; j < n2; ++j) {
                t2[j] = tab[m + 1 + j];
            }

            int k = 0;
            int l = 0;

            int z = low;
            while (k < n1 && l < n2) {
                if (t1[k] <= t2[l]) {
                    tab[z] = t1[k];
                    k++;
                } else {
                    tab[z] = t2[l];
                    l++;
                }
                z++;
            }
            while (k < n1) {
                tab[z] = t1[k];
                k++;
                z++;
            }
            while (l < n2) {
                tab[z] = t2[l];
                l++;
                z++;
            }
        }
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
