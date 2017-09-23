package solutions.CrackingTheCodingInterview;

import java.util.LinkedList;
import java.util.Queue;

// Day 22: Binary Search Trees
// https://www.hackerrank.com/challenges/30-binary-search-trees/problem

public class BinaryTreeTraversal {

    static class Tree {
        Node root;

        Tree(Node node) {
            root = node;
        }

        void enter(Node node) {
            if (node != null)
                System.out.printf("%d -> entered\n", node.data);
        }

        void visit(Node node) {
            System.out.printf("%d -> visited\n", node.data);
        }

        void levelOrderTraversal(Node node) { // level1 - level2 - level3
            Queue<Node> queue = new LinkedList<>();

            // add root to queue
            queue.add(node);

            while (!queue.isEmpty()) {
                Node head = queue.remove();
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

        void inOrderTraversal(Node node) { // left-current-right

            if (node != null) {
                inOrderTraversal(node.left);
                visit(node);
                inOrderTraversal(node.right);
            }
        }

        void preOrderTraversal(Node node) { // current-left-right

            if (node != null) {
                visit(node);
                preOrderTraversal(node.left);
                preOrderTraversal(node.right);
            }
        }

        void postOrderTraversal(Node node) { // left-right-current

            if (node != null) {
                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                visit(node);
            }
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1); // left-left
        Node n2 = new Node(2); // left
        Node n3 = new Node(3); // left-right
        Node root = new Node(4); // root
        Node n5 = new Node(5); // right-left
        Node n6 = new Node(6); // right
        Node n7 = new Node(7); // right-right

        // left
        root.left = n2;
        n2.left = n1;
        n2.right = n3;

        // right
        root.right = n6;
        n6.left = n5;
        n6.right = n7;

        // create Tree tree
        Tree tree = new Tree(root);

        /*
        *
        *              4
        *            /  \
        *          2     6
        *         / \   / \
        *        1  3  5  7
        *
        */


        ////////////////////////////////////////////
        // Breadth First Traversals (BFS)
        ////////////////////////////////////////////
        // 4 - 2 - 6 - 1 - 3 - 5 - 7 // entered

        // levelOrder
        // 4 - 2 - 6 - 1 - 3 - 5 - 7 // visited
        System.out.println("levelOrderTraversal: level1 - level2 - level3");
        tree.levelOrderTraversal(root);
        System.out.println("-----");


        ////////////////////////////////////////////
        // Depth First Traversals (DFS)
        ////////////////////////////////////////////
        // 4 - 2 - 1 - 3 - 6 - 5 - 7 // entered

        // inOrder
        // 1 - 2 - 3 - 4 - 5 - 6 - 7 // visited
        System.out.println("inOrderTraversal: left-current-right");
        tree.inOrderTraversal(root);
        System.out.println("-----");

        // preOrder
        // 4 - 2 - 1 - 3 - 6 - 5 - 7 // visited
        System.out.println("preOrderTraversal: current-left-right");
        tree.preOrderTraversal(root);
        System.out.println("-----");

        // postOrder
        // 1 - 3 - 2 - 5 - 7 - 6 - 4 // visited
        System.out.println("postOrderTraversal: left-right-current");
        tree.postOrderTraversal(root);
        System.out.println("-----");
    }

}


