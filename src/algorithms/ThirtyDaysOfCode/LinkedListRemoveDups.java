package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

public class LinkedListRemoveDups {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    // METHOD 1 (using if and continue)
    public static Node removeDuplicates(Node head) {
        Node node = head;

        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                continue; // pointer remains on the "same" node
            }
            node = node.next; // pointer moves to the "next" node
        }

        return head;
    }

    // METHOD 2 (using if and else)
//    public static Node removeDuplicates(Node head) {
//        Node start = head;
//
//        while (start.next != null) {
//            if (start.data == start.next.data) {
//                start.next = start.next.next;
//            } else {
//                start = start.next;
//            }
//        }
//
//        return head;
//    }

    // METHOD 3 (using nested while loops)
//    public static Node removeDuplicates(Node head) {
//        Node start = head;
//
//        while (start != null) {
//            while (start.next != null && start.data == start.next.data) {
//                start.next = start.next.next;
//            }
//            start = start.next;
//        }
//
//        return head;
//    }

    // METHOD 4 (using HashSet)
//    public static Node removeDuplicates(Node head) {
//        Set<Integer> set = new HashSet<>();
//
//        Node start = head;
//
//        while (start.next != null) {
//            if (set.contains(start.next.data)) {
//                start.next = start.next.next;
//                continue;
//            }
//            set.add(start.next.data);
//            start = start.next;
//        }
//
//        return head;
//    }


    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

}
