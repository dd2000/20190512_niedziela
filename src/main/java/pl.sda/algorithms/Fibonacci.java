package pl.sda.algorithms;

public class Fibonacci {
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
    }}
