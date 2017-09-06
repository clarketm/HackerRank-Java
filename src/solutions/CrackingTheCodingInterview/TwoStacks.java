package solutions.CrackingTheCodingInterview;

import helpers.TwoStackQueue;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks

public class TwoStacks {

    public static void main(String[] args) {
        TwoStackQueue<Integer> queue = new TwoStackQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }


}
