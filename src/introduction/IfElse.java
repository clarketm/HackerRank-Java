package introduction;

import java.util.Scanner;

// Java If-Else
// https://www.hackerrank.com/challenges/java-if-else/problem

// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird

public class IfElse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 1) {
            // odd
            System.out.println("Weird");
        } else {
            // even
            if (n <= 5) {
                System.out.println("Not Weird");
            } else if (n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

}
