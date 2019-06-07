package graph;

import util.Pair;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstInOrder {
    public static <T> List<T> traverse(Graph<T> graph, T startNode) {
        List<T> visited = new ArrayList<>();
        visited.add(startNode);
        return traverse(graph, startNode, visited);
    }

    public static <T> List<T> traverse(Graph<T> graph, T startNode, List<T> visited) {
        for (Pair<T, Integer> neighbor : graph.findNeighbors(startNode)) {
            if (!visited.contains(neighbor.keyA)) {
                visited.add(neighbor.keyA);
                traverse(graph, neighbor.keyA, visited);
            }
        }

        return visited;
    }
}
