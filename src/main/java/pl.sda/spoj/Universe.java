package pl.sda.spoj;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/TEST/
 */
public class Universe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("42")) {
                break;
            }
            System.out.println(value);
        }
    }
}
