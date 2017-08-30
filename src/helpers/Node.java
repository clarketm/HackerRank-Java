package helpers;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int position;
    private List<Integer> adjacents = new ArrayList<>();
    private int distance = -1;
    private boolean visited = false;

    public Node(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public List<Integer> getAdjacents() {
        return adjacents;
    }

    public void addAdjacent(int adjacent) {
        this.adjacents.add(adjacent);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
