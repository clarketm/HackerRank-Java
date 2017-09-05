package helpers;

import java.util.Arrays;

/**
 * Heap of ints
 **/
abstract class Heap {
    /**
     * Current array length
     **/
    protected int capacity;
    /**
     * Current number of elements in Heap
     **/
    protected int size;
    /**
     * Array of Heap elements
     **/
    protected int[] items;

    public Heap() {
        this.capacity = 10;
        this.size = 0;
        this.items = new int[capacity];
    }

    /**
     * @param parentIndex The index of the parent element.
     * @return The index of the left child.
     **/
    public int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    /**
     * @param parentIndex The index of the parent element.
     * @return The index of the right child.
     **/
    public int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    /**
     * @param childIndex The index of the child element.
     * @return The index of the parent element.
     **/
    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    /**
     * @param index The index of the element you are checking.
     * @return true if the Heap contains enough elements to fill the left child index,
     * false otherwise.
     **/
    public boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    /**
     * @param index The index of the element you are checking.
     * @return true if the Heap contains enough elements to fill the right child index,
     * false otherwise.
     **/
    public boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    /**
     * @param index The index of the element you are checking.
     * @return true if the calculated parent index exists within array bounds
     * false otherwise.
     **/
    public boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    /**
     * @param index The index of the element whose child you want.
     * @return the value in the left child.
     **/
    public int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    /**
     * @param index The index of the element whose child you want.
     * @return the value in the right child.
     **/
    public int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    /**
     * @param index The index of the element you are checking.
     * @return the value in the parent element.
     **/
    public int parent(int index) {
        return items[getParentIndex(index)];
    }

    /**
     * @param indexOne The first index for the pair of elements being swapped.
     * @param indexTwo The second index for the pair of elements being swapped.
     **/
    public void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    /**
     * Doubles underlying array if capacity is reached.
     **/
    public void ensureCapacity() {
        if (size == capacity) {
            capacity = capacity << 1;
            items = Arrays.copyOf(items, capacity);
        }
    }

    /**
     * @return The value at the top of the Heap.
     * @throws IllegalStateException if Heap is empty.
     **/
    public int peek() {
        isEmpty("peek");

        return items[0];
    }

    /**
     * @throws IllegalStateException if Heap is empty.
     **/
    public void isEmpty(String methodName) {
        if (size == 0) {
            throw new IllegalStateException(
                    "You cannot perform '" + methodName + "' on an empty Heap."
            );
        }
    }

    /**
     * Extracts root element from Heap.
     *
     * @throws IllegalStateException if Heap is empty.
     **/
    public int poll() {
        // Throws an exception if empty.
        isEmpty("poll");

        // Else, not empty
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    /**
     * @param item The value to be inserted into the Heap.
     **/
    public void add(int item) {
        // Resize underlying array if it's not large enough for insertion
        ensureCapacity();

        // Insert value at the next open location in heap
        items[size] = item;
        size++;

        // Correct order property
        heapifyUp();
    }

    public int getSize() {
        return size;
    }

    /**
     * Swap values down the Heap.
     **/
    public abstract void heapifyDown();

    /**
     * Swap values up the Heap.
     **/
    public abstract void heapifyUp();
}