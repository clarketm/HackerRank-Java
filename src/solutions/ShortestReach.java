package solutions;

import helpers.Node;

import java.util.*;

// HackerRank
// https://www.hackerrank.com/challenges/bfsshortreach

public class ShortestReach {

    private static final int EDGE_DISTANCE = 6;
    private static List<String> results;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        results = new ArrayList<>(q);

        for (int i_q = 0; i_q < q; i_q++) {
            int n = in.nextInt(); // # of nodes
            int m = in.nextInt(); // # of edges

            List<Node> nodes = new ArrayList<>(n);
            for (int i_n = 0; i_n < n; i_n++) {
                nodes.add(i_n, new Node(i_n + 1));
            }

            for (int i_m = 0; i_m < m; i_m++) {
                int u = in.nextInt() - 1; // edge start index
                int v = in.nextInt() - 1; // edge end index

                nodes.get(u).addAdjacent(v);
                nodes.get(v).addAdjacent(u);
            }

            int s = in.nextInt() - 1; // start node index

            BFS(nodes, nodes.get(s));
            addResult(nodes, s);

        }
        printResults();
    }

    private static void BFS(List<Node> nodes, Node startNode) {
        Queue<Node> queue = new LinkedList<>();

        startNode.setDistance(0); // set `distance`
        startNode.setVisited(true); // set `visited`
        queue.add(startNode); // enqueue`

        while (!queue.isEmpty()) {
            Node head = queue.remove(); // dequeue

            for (int adj : head.getAdjacents()) {
                Node adjNode = nodes.get(adj);

                if (!adjNode.isVisited()) {
                    adjNode.setDistance(head.getDistance() + EDGE_DISTANCE); // set `distance`
                    adjNode.setVisited(true); // set `visited`
                    queue.add(adjNode); // enqueue
                }
            }
        }
    }

    private static void addResult(List<Node> nodes, int s) {
        StringJoiner result = new StringJoiner(" ");
        for (int i = 0; i < nodes.size(); i++) {
            if (i != s) {
                result.add(Integer.toString(nodes.get(i).getDistance()));
            }
        }
        result.add("\n");
        results.add(result.toString());
    }

    private static void printResults() {
        for (String result : results) {
            System.out.printf(result);
        }
    }

}
