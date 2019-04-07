package pl.sda.algorithms;

import java.util.Arrays;

public class Fibonacci {
    // cHVibGljIHN0YXRpYyB2b2lkIG1haW4oU3RyaW5nW10gYXJncykgewogICAgICAgIGludCBuID0gMTA7CiAgICAgICAgU3lzdGVtLm91dC5wcmludGxuKEFycmF5cy50b1N0cmluZyhmaWIobikpKTsKCiAgICAgICAgLy8gIzEKICAgICAgICBpbnRbXSByZXN1bHQxID0gbmV3IGludFtuXTsKICAgICAgICBTeXN0ZW0ub3V0LnByaW50bG4oQXJyYXlzLnRvU3RyaW5nKGZpYlJlYyhyZXN1bHQxLCBuKSkpOwoKICAgICAgICAvLyAjMgogICAgICAgIGludFtdIHJlc3VsdDIgPSBuZXcgaW50W25dOwogICAgICAgIGZvciAoaW50IGkgPSAxOyBpIDw9IG47IGkrKykgewogICAgICAgICAgICByZXN1bHQyW2kgLSAxXSA9IGZpYm9uYWNjaShpKTsKICAgICAgICB9CiAgICAgICAgU3lzdGVtLm91dC5wcmludGxuKEFycmF5cy50b1N0cmluZyhyZXN1bHQyKSk7CiAgICB9CgogICAgcHJpdmF0ZSBzdGF0aWMgaW50W10gZmliKGludCBpKSB7CiAgICAgICAgaW50W10gcmVzdWx0ID0gbmV3IGludFtpXTsKICAgICAgICByZXN1bHRbMF0gPSAwOwogICAgICAgIHJlc3VsdFsxXSA9IDE7CiAgICAgICAgZm9yIChpbnQgbiA9IDI7IG4gPCBpOyBuKyspIHsKICAgICAgICAgICAgcmVzdWx0W25dID0gcmVzdWx0W24gLSAxXSArIHJlc3VsdFtuIC0gMl07CiAgICAgICAgfQogICAgICAgIHJldHVybiByZXN1bHQ7CiAgICB9CgogICAgcHVibGljIHN0YXRpYyBpbnRbXSBmaWJSZWMoaW50W10gcmVzdWx0LCBpbnQgaSkgewogICAgICAgIGkgPSBpIC0gMTsKICAgICAgICBpZiAoaSA9PSAwKSB7CiAgICAgICAgICAgIHJlc3VsdFtpXSA9IDA7CiAgICAgICAgfQogICAgICAgIGlmIChpID09IDEpIHsKICAgICAgICAgICAgcmVzdWx0W2ldID0gMTsKICAgICAgICB9CiAgICAgICAgaWYgKGkgPiAxKSB7CiAgICAgICAgICAgIGZpYlJlYyhyZXN1bHQsIGkpOwogICAgICAgICAgICByZXN1bHRbaV0gPSByZXN1bHRbaSAtIDFdICsgcmVzdWx0W2kgLSAyXTsKICAgICAgICB9CiAgICAgICAgcmV0dXJuIHJlc3VsdDsKICAgIH0KCiAgICBwdWJsaWMgc3RhdGljIGludCBmaWJvbmFjY2koaW50IG4pIHsKICAgICAgICBpZiAobiA9PSAxKSB7CiAgICAgICAgICAgIHJldHVybiAwOwogICAgICAgIH0KICAgICAgICBpZiAobiA9PSAyKSB7CiAgICAgICAgICAgIHJldHVybiAxOwogICAgICAgIH0KICAgICAgICByZXR1cm4gZmlib25hY2NpKG4gLSAxKSArIGZpYm9uYWNjaShuIC0gMik7CiAgICB9

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(fib(n)));

//        // #1
        int[] result1 = new int[n];
        System.out.println(Arrays.toString(fibRec(result1, n)));
//
//        // #2
        int[] result2 = new int[n];
        for (int i = 1; i <= n; i++) {
            result2[i - 1] = fibonacci(i);
        }
        System.out.println(Arrays.toString(result2));
    }

    private static int[] fib(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static int[] fibRec(int[] result, int n) {
        n = n - 1;
        if (n == 1) {
            result[1] = 1;
        }
        if (n > 1) {
            fibRec(result, n);
            result[n] = result[n - 1] + result[n - 2];
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // 1 + fibonacci(1)
        // 1 + 0
    }
}
