import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// HackerRank
// https://www.hackerrank.com/challenges/angry-children

public class MaxMin {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for (int i = 0; i < N; i++)
            list[i] = Integer.parseInt(in.readLine());

      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */
        Arrays.sort(list);

        int step = K - 1;

        int low = 0;
        int high = step;

        int min = list[low];
        int max = list[high];

        while (high < list.length) {
            if ((list[high] - list[low]) < (max - min)) {
                min = list[low];
                max = list[high];
            }
            low++;
            high++;
        }

        int unfairness = max - min;

        System.out.println(unfairness);
    }

}
