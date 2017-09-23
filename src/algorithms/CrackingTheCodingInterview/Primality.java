package algorithms.CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-big-o

public class Primality {

    /*
    *
    * The sqrt(n) is sufficient because:
    *   for every number `a`
    *   which divides `n` evenly,
    *   there is a complement: `b`,
    *   where: a * b = n.
    *
    * If a > sqrt(n),
    * then b < sqrt(n) ... since sqrt(n) * sqrt(n) = n.
    * therefore we don't need `a` to check `n` primality,
    * since we would have already checked with `b`.
    *
    */

    private static Set<Integer> cache = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            printResult(isPrime(n));
        }
    }

    private static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }

        int n = 2;
        int end = (int) Math.sqrt(p);

        while (n <= end) {
            if (cache.contains(p)) {
                return true;
            }
            if (p % n == 0) {
                return false;
            }
            n++;
        }
        cache.add(p);
        return true;
    }

    private static void printResult(boolean result) {
        String output = result ? "Prime" : "Not prime";
        System.out.println(output);
    }

}
