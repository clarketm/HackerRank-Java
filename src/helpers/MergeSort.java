package helpers;

public class MergeSort {

    protected int[] array;

    public void sort(int[] values) {
        this.array = values;
        mergesort(0, values.length - 1);
    }

    protected void mergesort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    protected void merge(int low, int mid, int high) {

        int p = low;
        int q = mid + 1;

        int[] _array = new int[high - low + 1];

        int k = 0;
        for (int i = low; i <= high; i++) {
            if (p > mid) {
                _array[k] = array[q];
                q++;
            } else if (q > high) {
                _array[k] = array[p];
                p++;
            } else if (array[p] <= array[q]) {
                _array[k] = array[p];
                p++;
            } else if (array[q] <= array[p]) {
                _array[k] = array[q];
                q++;
            }
            k++;
        }
        copyToArray(k, low, _array);
    }

    protected void copyToArray(int k, int low, int[] _array) {
        for (int i = 0; i < k; i++) {
            array[low] = _array[i];
            low++;
        }
    }

}
