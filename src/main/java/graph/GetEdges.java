package graph;

import util.Pair;

import java.util.List;

public abstract class GetEdges {
    public static <T> Pair<Boolean, Integer> getEdges(Graph<T> graph, T[] stops) {
        int edgeWeight = 0;
        int stop = 0;

        List<Pair<T, Integer>> currentNode = graph.findNode(stops[0]);

        while (currentNode != null && stop != stops.length - 1) {
            boolean found = false;
            List<Pair<T, Integer>> neighbors = graph.findNeighbors(stops[stop]);
            for (Pair<T, Integer> neighbor : neighbors) {
                if (neighbor.keyA.equals(graph.findNode(stops[stop + 1]).get(0).keyA)) {
                    currentNode = graph.findNode(neighbor.keyA);
                    edgeWeight += neighbor.keyB;
                    stop++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                currentNode = null;
            }
        }

        if (stop == stops.length - 1) {
            return new Pair<Boolean, Integer>(Boolean.TRUE, edgeWeight);
        } else {
            return new Pair<Boolean, Integer>(Boolean.FALSE, 0);
        }
    }
}
