package solutions.CrackingTheCodingInterview;

//import java.util.HashMap;
//import java.util.Map;

import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-making-anagrams

public class MakingAnagrams {
    public static final int ALPHABET_SIZE = 26;
    public static final int ALPHABET_OFFSET = 'a';

/*    public static int numberNeededMap(String first, String second) {
        Map<Character, Integer> firstChar = new HashMap<>();
        Map<Character, Integer> secondChar = new HashMap<>();

        int deletions = 0;

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            firstChar.put(ch, firstChar.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < second.length(); i++) {
            char ch = second.charAt(i);
            secondChar.put(ch, secondChar.getOrDefault(ch, 0) + 1);
        }

        for (char key : firstChar.keySet()) {
            int diff = firstChar.get(key) - secondChar.getOrDefault(key, 0);
            deletions += Math.abs(diff);
        }

        for (char key : secondChar.keySet()) {
            int diff = secondChar.get(key) - firstChar.getOrDefault(key, 0);
            deletions += Math.abs(diff);
        }

        return deletions;
    }*/

    public static int numberNeeded(String first, String second) {
        char[] f = first.toCharArray();
        char[] s = second.toCharArray();
        int[] charCount = new int[ALPHABET_SIZE];

        int deletions = 0;

        for (char ch : f) {
            charCount[ch - ALPHABET_OFFSET]++;
        }

        for (char ch : s) {
            charCount[ch - ALPHABET_OFFSET]--;
        }

        for (int i : charCount) {
            deletions += Math.abs(i);
        }

        return deletions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
//        System.out.println(numberNeededMap(a, b));
        System.out.println(numberNeeded(a, b));
    }
}
