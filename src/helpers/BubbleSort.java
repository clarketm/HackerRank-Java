package helpers;

import static helpers.SortUtils.swap;

public class BubbleSort {

    protected int[] array;

    public void sort(int[] values) {
        this.array = values;
        bubblesort(array);
    }

    protected void bubblesort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

}
