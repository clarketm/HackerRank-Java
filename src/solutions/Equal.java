package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/equal

public class Equal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> results = new ArrayList<>(t);

        while (t > 0) {
            int n = in.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
            int minChocolateOperations = getMinChocolateOperations(n, c);
            results.add(minChocolateOperations);
            t--;
        }

        for (int result : results) {
            System.out.println(result);
        }

    }

    private static int getMinChocolateOperations(int numColleagues, int[] chocolateCounts) {
        int max = Arrays.stream(chocolateCounts).max().getAsInt();
        int min = Arrays.stream(chocolateCounts).min().getAsInt();



        while (max != min) {
            max = Arrays.stream(chocolateCounts).max().getAsInt();
            min = Arrays.stream(chocolateCounts).min().getAsInt();



        }

        System.out.println(numColleagues);
        System.out.println(Arrays.toString(chocolateCounts));
        return 0;
    }

}
