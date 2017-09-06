package solutions.CrackingTheCodingInterview;

import helpers.MergeSortInversions;

import java.util.Arrays;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-merge-sort

public class CountingInversions {

    static long countInversions(int[] arr) {
        MergeSortInversions ms = new MergeSortInversions();
        ms.sort(arr);
        return ms.getInversions();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }

}
