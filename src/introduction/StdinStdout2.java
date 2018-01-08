package introduction;

import java.util.Scanner;

// Java Stdin and Stdout II
// https://www.hackerrank.com/challenges/java-stdin-stdout/problem

public class StdinStdout2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        double d = in.nextDouble();

        // clear newline character
        in.nextLine();

        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
