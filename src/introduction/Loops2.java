package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Java Loops II
// https://www.hackerrank.com/challenges/java-loops/problem

public class Loops2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int prev, result;

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            List<Integer> results = new ArrayList<>(n);
            prev = a;

            for (int p = 0; p < n; p++) {
                result = (int) (prev + (Math.pow(2, p) * b));
                results.add(result);
                prev = result;
            }

            String s = results.stream().map(Object::toString).collect(Collectors.joining(" "));

            System.out.println(s);

        }
    }

}
