package solutions;

import java.util.ArrayList;
import java.util.Scanner;

// HackerRank
// https://www.hackerrank.com/challenges/dynamic-array

public class DynamicArray {

    static class QueryType {
        public static final int ONE = 1;
        public static final int TWO = 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int lastAnswer = 0;

        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            seqList.add(new ArrayList<>());
        }

//        HashMap<Integer, Integer> items = new HashMap<>(N);
//        int[][] seqList = new int[N][];
//        for (int i = 0; i < seqList.length; i++) {
//            seqList[i] = new int[Q];
//        }

        // process queries
        for (int i = 0; i < Q; i++) {
            int query = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int seq;
            int index;

            switch (query) {
                case QueryType.ONE:
                    seq = (x ^ lastAnswer) % N;
                    seqList.get(seq).add(y);
//                    seqList[seq][items.getOrDefault(seq, 0)] = y;
//                    items.put(seq, items.getOrDefault(seq, 0) + 1);
                    break;
                case QueryType.TWO:
                    seq = (x ^ lastAnswer) % N;
                    index = y % seqList.get(seq).size();
                    lastAnswer = seqList.get(seq).get(index);
//                    index = y % seqList[seq].length;
//                    lastAnswer = seqList[seq][index];
                    System.out.println(lastAnswer);
            }
        }
    }
}
