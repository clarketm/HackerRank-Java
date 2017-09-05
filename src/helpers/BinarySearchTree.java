package helpers;

public class BinarySearchTree {
    private int[] array;

    public BinarySearchTree(int[] array) {
        this.array = array;
    }

    public int search(int target) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (target == array[mid]) {
                return array[mid];
            } else if (target > array[mid]) {
                low = mid + 1;
            } else if (target < array[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}
