package pl.sda.spoj;

import java.util.Scanner;

public class IsPrime {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (isPrime(value)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    private static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }
        for (int i = 2; i <= (val / 2); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
