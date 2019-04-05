package pl.sda.algorithms;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }

    private static int sum(int start, int end) {
        if (start == end) {
            return start;
        }
        return start + sum(start + 1, end);

        // sum(1, 10)
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
}
