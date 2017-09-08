package solutions.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-recursion/problem

public class Recursion {

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

}
