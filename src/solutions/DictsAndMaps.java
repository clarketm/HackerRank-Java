package solutions;

import java.util.HashMap;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/30-dictionaries-and-maps

public class DictsAndMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // add contact
            contacts.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (contacts.containsKey(s)) {
                System.out.printf("%s=%d\n", s, contacts.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
