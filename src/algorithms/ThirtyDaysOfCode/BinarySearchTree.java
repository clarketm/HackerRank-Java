package algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

public class BinarySearchTree {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

//    METHOD 1
//    public static int getHeight(Node root) {
//        if (root == null) {
//            return -1;
//        }
//
//        return Math.max(
//                getHeight(root.left),
//                getHeight(root.right)
//        ) + 1;
//    }

//    METHOD 2
//    public static int getHeight(Node root) {
//        int leftHeight = 0;
//        int rightHeight = 0;
//
//        if (root.left != null) {
//            leftHeight = getHeight(root.left) + 1;
//        }
//
//        if (root.right != null) {
//            rightHeight = getHeight(root.right) + 1;
//        }
//
//        return Math.max(leftHeight, rightHeight);
//    }

    //    METHOD 3
    public static int getHeight(Node root) {
        int leftHeight = (root.left == null) ? 0 : getHeight(root.left) + 1;
        int rightHeight = (root.right == null) ? 0 : getHeight(root.right) + 1;
        return Math.max(leftHeight, rightHeight);
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
        int height = getHeight(root);
        System.out.println(height);
    }

}
