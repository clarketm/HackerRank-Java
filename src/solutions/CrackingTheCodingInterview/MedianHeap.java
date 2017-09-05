package solutions.CrackingTheCodingInterview;

import helpers.MaxHeap;
import helpers.MinHeap;

import java.util.Scanner;


// HackerRank
// https://www.hackerrank.com/challenges/ctci-find-the-running-median

public class MedianHeap {
    private MinHeap upper = new MinHeap();
    private MaxHeap lower = new MaxHeap();
    private float median = 0;


    public static void main(String[] args) {
        MedianHeap heap = new MedianHeap();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            heap.add(v);
            heap.balance();
            heap.calculateMedian();
            System.out.printf("median: %.1f\n", heap.getMedian());
        }

    }

    public void add(int v) {
        if (v > median) {
            upper.add(v); // add to `upper`
        } else {
            lower.add(v); // add to `lower`
        }
    }

    public void balance() {
        // rebalance size  difference between `upper` and `lower` to 1
        if (Math.abs(upper.getSize() - lower.getSize()) > 1) {
            if (upper.getSize() > lower.getSize()) {
                lower.add(upper.poll());
            } else {
                upper.add(lower.poll());
            }
        }
    }

    public void calculateMedian() {
        int upperSize = upper.getSize();
        int lowerSize = lower.getSize();

        if (upperSize == lowerSize) {
            median = ((float) upper.peek() + (float) lower.peek()) / 2;
        } else if (upperSize > lowerSize) {
            median = (float) upper.peek();
        } else if (lowerSize > upperSize) {
            median = (float) lower.peek();
        }
    }

    public float getMedian() {
        return median;
    }

}






