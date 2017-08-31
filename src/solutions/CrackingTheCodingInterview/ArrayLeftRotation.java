package solutions.CrackingTheCodingInterview;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-array-left-rotation

public class ArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] rotatedArray = leftRotate(d, a);

        for (int item : rotatedArray) {
            System.out.printf("%d ", item);
        }
    }

    private static int[] leftRotate(int numRotations, int[] array) {
        int length = array.length;
        int[] _array = new int[length];
        int pos;

        for (int i = 0; i < length; i++) {
            pos = (length + (i - numRotations)) % length;
            _array[pos] = array[i];
        }

        return _array;
    }

}
