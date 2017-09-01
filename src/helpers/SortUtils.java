package helpers;

public class SortUtils {

    public static int[] swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }

}
