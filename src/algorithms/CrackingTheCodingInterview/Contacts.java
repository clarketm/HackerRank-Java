package algorithms.CrackingTheCodingInterview;

import helpers.Trie;

import java.util.*;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-contacts

public class Contacts {
    private static Trie contacts = new Trie();

    private static final String ADD = "add";
    private static final String FIND = "find";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String action = in.next();

            switch (action) {
                case ADD:
                    String name = in.next();
                    contacts.add(name);
                    break;
                case FIND:
                    String partial = in.next();
                    int hits = contacts.find(partial);
                    System.out.println(hits);
                    break;
            }
        }
    }
}

