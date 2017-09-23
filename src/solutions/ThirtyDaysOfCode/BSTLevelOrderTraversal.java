package solutions.ThirtyDaysOfCode;

import solutions.CrackingTheCodingInterview.BinaryTreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTLevelOrderTraversal {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static void visit(Node head) {
        System.out.printf("%d ", head.data);
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();

        // add root to queue
        queue.add(root);

        while (!queue.isEmpty()) {
            Node head = queue.remove();
            // visit `head`
            visit(head);

            // add left to queue
            if (head.left != null) {
                queue.add(head.left);
            }
            // add right to queue
            if (head.right != null) {
                queue.add(head.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
