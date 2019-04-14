package pl.sda.sorting.bubble;

import java.util.Scanner;

public class BubbleSortOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            String[] chunks = s.split(" ");
            int[] tab = new int[n];
            for (int k = 0; k < n; k++) {
                tab[k] = Integer.parseInt(chunks[k]);
            }
            // ---
            long count = 0;
            n = n - 1;
            while (true) {
                int newn = 0;
                for (int k = 0; k < n; k++) {
                    int a = tab[k];
                    int b = tab[k + 1];
                    if (a > b) {
                        count++;
                        tab[k] = b;
                        tab[k + 1] = a;
                        newn = k;
                    }
                }
                if (newn == 0) {
                    break;
                }
                n = newn;
            }
            System.out.println(count);
        }
    }
}
