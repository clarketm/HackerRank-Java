package solutions.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-ransom-note

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        HashMap<String, Integer> magazine = new HashMap<>(m);

        String word;
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            word = in.next();
            magazine.put(word, magazine.getOrDefault(word, 0) + 1);
        }
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            word = in.next();
            if (magazine.getOrDefault(word, 0) > 0) {
                magazine.put(word, magazine.get(word) - 1);
                continue;
            }
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}

