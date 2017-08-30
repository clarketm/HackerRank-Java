package solutions;
// HackerRank
// https://www.hackerrank.com/challenges/two-arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PermutingTwoArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> results = new ArrayList<>(n);

        while (n > 0) {
            int l = in.nextInt();
            int k = in.nextInt();

            int[] a = new int[l];
            int[] b = new int[l];

            for (int i_l = 0; i_l < l; i_l++) {
                a[i_l] = in.nextInt();
            }

            for (int i_l = 0; i_l < l; i_l++) {
                b[i_l] = in.nextInt();
            }

            String isValid = isValidPermutation(k, a, b);
            results.add(isValid);
            n--;
        }

        for (String result : results) {
            System.out.println(result);
        }

    }

    private static String isValidPermutation(int k, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        String isValid = "YES";

        int low = 0;
        int high = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if ((a[low] + b[high]) < k) {
                isValid = "NO";
                break;
            }
            low++;
            high--;
        }

        return isValid;
    }

}
