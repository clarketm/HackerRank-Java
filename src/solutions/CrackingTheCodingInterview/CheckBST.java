package solutions.CrackingTheCodingInterview;

// HackerRank
// https://www.hackerrank.com/challenges/ctci-array-left-rotation

public class CheckBST {

    public static void main(String[] args) {
        Node childLeft = new Node(1, null, null);
        Node childRight = new Node(3, null, null);
        Node root = new Node(2, childLeft, childRight);

        boolean isBST = new CheckBST().checkBST(root);
        System.out.println(isBST ? "Yes" : "No");
    }

    private boolean checkBST(Node root) {
        return checkLeft(root.data, root.left) && checkRight(root.data, root.right);
    }

    private boolean checkLeft(int parentData, Node child) {
        if (child == null) {
            return true;
        }
        if (child.data > parentData) {
            return false;
        }
        return checkBST(child);
        // OR: return child == null || child.data <= parentData && checkBST(child);
    }

    private boolean checkRight(int parentData, Node child) {
        if (child == null) {
            return true;
        }
        if (child.data < parentData) {
            return false;
        }
        return checkBST(child);
        // OR: return child == null || child.data >= parentData && checkBST(child);
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

