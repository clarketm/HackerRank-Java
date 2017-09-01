package solutions.CrackingTheCodingInterview;

import java.util.*;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-linked-list-cycle

public class DetectACycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        boolean isCyclical;

        // hasCycle: false
        Node head1 = new Node(1);
        Node second1 = new Node(2);
        Node third1 = new Node(3);

        head1.setNext(second1);
        second1.setNext(third1);
        third1.setNext(null);

        isCyclical = hasCycle(head1);
        System.out.println(isCyclical); // false

        // hasCycle: true
        Node head2 = new Node(1);
        Node second2 = new Node(2);
        Node third2 = new Node(3);

        head2.setNext(second2);
        second2.setNext(third2);
        third2.setNext(head2);

        isCyclical = hasCycle(head2);
        System.out.println(isCyclical); // true
    }

    static boolean hasCycle(Node head) {
        Set<String> visited = new HashSet<>();

        while (head != null) {
            String uuid = head.toString();
            if (visited.contains(uuid)) {
                return true;
            } else {
                visited.add(uuid);
            }
            head = head.next;
        }
        return false;
    }

}
