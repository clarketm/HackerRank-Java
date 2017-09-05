package solutions.CrackingTheCodingInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortComparator {

    static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player p1, Player p2) {
            /*
             * return:
             *  >0 (pos)   =>  sort `b` then `a` (switch)
             *  <0 (neg)   =>  sort `a` then `b` (keep)
             *  =0 (zero)  =>  leave `a` and `b` unchanged with respect to each other, but sort with respect to all other elements.
             *
             */
            // `p1.score` == `p2.score`
            if (p1.score == p2.score) {
                // sort `alphabetic/asc`
                return p1.name.compareTo(p2.name);
            } else {
                // sort `numeric/desc`
                return p2.score - p1.score;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}

