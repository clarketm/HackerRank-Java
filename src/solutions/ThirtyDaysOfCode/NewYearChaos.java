package solutions.ThirtyDaysOfCode;

import java.util.Scanner;

import static helpers.SortUtils.swap;

// HackerRank
// https://www.hackerrank.com/challenges/new-year-chaos/problem

public class NewYearChaos {

//    static void minimumBribes(int[] array) {
//        int k = 0;
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] - (i + 1) > 2) {
//                System.out.println("Too chaotic");
//                return;
//            }
//            for (int j = Math.max(0, array[i] - 2); j < i; j++)
//                if (array[j] > array[i])
//                    k++;
//        }
//        System.out.println(k);
//    }

    static void minimumBribes(int[] array) {
        int k = 0, l = 0;

        // Chaotic check AND Count swaps
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    k++;
                    l++;
                } else {
                    l = 0;
                }
                if (l > 2) {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int[] q = new int[n];
            for (int q_i = 0; q_i < n; q_i++) {
                q[q_i] = in.nextInt();
            }
            minimumBribes(q);
        }
        in.close();
    }

}
