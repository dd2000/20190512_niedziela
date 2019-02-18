package pl.sda.algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(fib(10)));

//        System.out.println(sum(1, 10));

        int[] result = new int[n];

        // #1
//        System.out.println(Arrays.toString(fibRec(result, n)));

        // #2
        for (int i = 1; i <= n; i++) {
            result[i] = fibonacci(i);
        }
        System.out.println(Arrays.toString(fibRec(result, n)));
    }

    private static int[] fib(int i) {
        int[] result = new int[i];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        for (int n = 3; n <= i - 1; n++) {
            result[n] = result[n - 1] + result[n - 2];
        }
        return result;
    }

    private static int sum(int start, int end) {
        if (start == end) {
            return start;
        }
        return start + sum(start + 1, end);

        // 1 + sum(2, 10)
        //  2 + sum(3, 10)
        //   3 + sum(4, 10)
        //    4 + sum(5, 10)
        //     5 + sum(6, 10)
        //      6 + sum(7, 10)
        //       7 + sum(8, 10)
        //        8 + sum(9, 10)
        //         9 + sum(10, 10)

        // 1 + sum(2, 10) + sum(3, 10) + sum(4, 10) + sum(5, 10) + sum(6, 10) + sum(7, 10) + sum(8, 10) + sum(9, 10) + sum(10, 10)
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
    }

    public static int[] fibRec(int[] result, int i) {
        i = i - 1;
        if (i == 0) {
            result[i] = 0;
        }
        if (i == 1) {
            result[i] = 1;
        }
        if (i > 1) {
            fibRec(result, i);
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
