package algorithms.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

    /*
    *
    * Return the fibonacci number `n` at a given sequence position `i`
    *
    * F(i) = F(i-1) + F(i-2)
    * F(0) = 0
    * F(1) = 1
    *
    * i: 0, 1, 2, 3, 4, 5, 6,  7,  8, ...
    * n: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    *
    */

// HackerRank
// https://www.hackerrank.com/challenges/ctci-fibonacci-numbers

public class Fibonacci {
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(0, 0);
        cache.put(1, 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // `i`: sequence position
        // return `n: integer at sequence position `i`
        System.out.println(fibonacci(i));
    }

    // optimized using memoization
    private static int fibonacci(int i) {
        if (cache.containsKey(i)) {
            return cache.get(i);
        }

        int n = fibonacci(i - 1) + fibonacci(i - 2);
        cache.put(i, n);

        return n;
    }

//    private static int fibonacci(int i) {
//        if (i == 0) {
//            return 0;
//        }
//        if (i == 1) {
//            return 1;
//        }
//        return fibonacci(i - 1) + fibonacci(i - 2);
//    }

}
