package introduction;

import java.util.Scanner;

// Java End-of-file
// https://www.hackerrank.com/challenges/java-end-of-file/problem

public class EndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lineNumber = 1;
        while (in.hasNext()) {
            System.out.printf("%d %s\n", lineNumber, in.nextLine());
            lineNumber++;
        }
    }

}
