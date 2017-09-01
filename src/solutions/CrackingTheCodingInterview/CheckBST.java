package solutions.CrackingTheCodingInterview;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-is-binary-search-tree

public class CheckBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Node childLeftLeft = new Node(1, null, null);
        Node childLeftRight = new Node(3, null, null);
        Node childLeft = new Node(2, childLeftLeft, childLeftRight);

        Node childRightLeft = new Node(5, null, null);
        Node childRightRight = new Node(7, null, null);
        Node childRight = new Node(6, childRightLeft, childRightRight);

        Node root = new Node(4, childLeft, childRight);

        boolean isBST = new CheckBST().isValidBST(root);
        System.out.println(isBST ? "Yes" : "No");
    }

    private boolean isValidBST(Node root) {
        return checkNode(root.left, Integer.MIN_VALUE, root.data) && checkNode(root.right, root.data, Integer.MAX_VALUE);
    }

    private boolean isValidBST(Node node, int minValue, int maxValue) {
        return checkNode(node.left, minValue, node.data) && checkNode(node.right, node.data, maxValue);
    }

    private boolean checkNode(Node node, int minValue, int maxValue) {
        if (node == null) {
            // reached the end of the branch (no more nodes to check)
            return true;
        } else if (node.data > minValue && node.data < maxValue) {
            // node data is within the min/max constraints
            return isValidBST(node, minValue, maxValue);
        } else {
            // node data is NOT within the min/max constraints
            return false;
        }
    }

}


