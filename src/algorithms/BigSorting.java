package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/big-sorting

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<String> array = new ArrayList<>(n);

        for (int array_i = 0; array_i < n; array_i++) {
            array.add(in.next());
        }

        array.sort((o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o2.length() < o1.length()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String item : array) {
            System.out.println(item);
        }
    }

}

