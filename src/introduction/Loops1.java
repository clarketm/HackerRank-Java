package introduction;

import java.util.Scanner;

// Java Loops I
// https://www.hackerrank.com/challenges/java-loops-i/problem

public class Loops1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
    }

}
