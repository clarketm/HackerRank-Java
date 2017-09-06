package solutions;

import java.util.Arrays;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/greedy-florist

public class GreedyFlorist {

    static int getMinimumCost(int totalNumOfFlowers, int totalNumOfCustomers, int[] costs) {

        // sort `costs` in ascending order.
        Arrays.sort(costs);

        int totalCost = 0;
        int numOfFlowers = totalNumOfFlowers;
        int flowerPtr = costs.length - 1;
        int flowersPurchasedPerCustomer = 0;

        flowers:
        while (numOfFlowers > 0) {
            for (int i = 0; i < totalNumOfCustomers; i++) {
                if (flowerPtr < 0) {
                    break flowers;
                }
                totalCost += (flowersPurchasedPerCustomer + 1) * costs[flowerPtr];
                flowerPtr--;
                numOfFlowers--;
            }
            flowersPurchasedPerCustomer++;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }

}
