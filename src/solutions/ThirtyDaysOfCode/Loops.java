package solutions.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-loops

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

}
