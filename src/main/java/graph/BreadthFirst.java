package graph;

import stacksandqueues.Queue;
import util.Pair;

import java.util.ArrayList;
import java.util.List;

public abstract class BreadthFirst {
    public static <T> List<T> breadthFirstTraversal(Graph<T> graph, T startNodeValue) {
        List<T> output = new ArrayList();
        List<T> visitedNodes = new ArrayList<>();

        Queue<List<Pair<T, Integer>>> traversalQueue = new Queue<>();
        traversalQueue.enqueue(graph.findNode(startNodeValue));
        visitedNodes.add(startNodeValue);

        while (traversalQueue.peek() != null) {
            List<Pair<T, Integer>> currentNode = traversalQueue.dequeue();
            if (!output.contains(currentNode.get(0).getKeyA())) {
                output.add(currentNode.get(0).getKeyA());
            }
            for (Pair<T, Integer> node : graph.findNeighbors(currentNode.get(0).getKeyA())) {
                if (!visitedNodes.contains(node.getKeyA())) {
                    traversalQueue.enqueue(graph.findNode(node.getKeyA()));
                    visitedNodes.add(node.getKeyA());
                }
            }
        }

        return output;
    }
}
