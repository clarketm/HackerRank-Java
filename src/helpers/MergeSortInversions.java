package helpers;

public class MergeSortInversions extends MergeSort {
    private long inversions;

    @Override
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
                inversions += (q - k) - low;
                q++;
            }
            k++;
        }
        copyToArray(k, low, _array);
    }

    public long getInversions() {
        return inversions;
    }

}
