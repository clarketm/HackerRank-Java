package solutions.ThirtyDaysOfCode;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-scope/problem

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    // O(n^2)
//    public void computeDifference() {
//        int diff;
//
//        for (int element1 : elements) {
//            for (int element2 : elements) {
//                diff = Math.abs(element1 - element2);
//                if (diff > maximumDifference) {
//                    maximumDifference = diff;
//                }
//            }
//        }
//    }

    // O(n)
    public void computeDifference() {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int element : elements) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        maximumDifference = max - min;
    }
}
