package solutions.ThirtyDaysOfCode;

import java.util.Scanner;

import static helpers.SortUtils.swap;

// Day 20: Sorting
// https://www.hackerrank.com/challenges/30-sorting/problem

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        sort(a);
    }

    static void sort(int[] array) {
        int numSwaps = 0;
        int len = array.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    numSwaps++;
                }
            }
        }

        int firstElement = array[0];
        int lastElement = array[len - 1];

        printResult(numSwaps, firstElement, lastElement);
    }

    static void printResult(int numSwaps, int firstElement, int lastElement) {
        System.out.println(String.format("Array is sorted in %d swaps.", numSwaps));
        System.out.println(String.format("First Element: %d", firstElement));
        System.out.println(String.format("Last Element: %d", lastElement));
    }

}
