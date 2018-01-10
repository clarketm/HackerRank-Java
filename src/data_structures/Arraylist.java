package data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Java Arraylist
// https://www.hackerrank.com/challenges/java-arraylist/problem

public class Arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cap = in.nextInt();

        List<int[]> list = new ArrayList<>(cap);

        for (int i = 0; i < cap; i++) {
            int len = in.nextInt();
            int[] array = new int[len];

            for (int j = 0; j < len; j++) {
                array[j] = in.nextInt();
            }
            list.add(array);
        }

        int queries = in.nextInt();

        for (int i = 0; i < queries; i++) {
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;

            try {
                System.out.println(list.get(row)[col]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }

}