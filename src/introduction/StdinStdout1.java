package introduction;

import java.util.Scanner;

// Java Stdin and Stdout I
// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

public class StdinStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
