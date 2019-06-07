package graph;

import hashes.HashMap;
import util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
    // integer is for weight, T is the value
    // The weight is -1 for a node with itself,
    // >= 0  otherwise
    protected ArrayList<List<Pair<T, Integer>>> vertices;


    public Graph() {
        vertices = new ArrayList<>();
    }


    public boolean addNode(T addVal) {
        if (this.contains(addVal)) {
            return false;
        }

        List<Pair<T, Integer>> addValHolder = new ArrayList<>();
        addValHolder.add(new Pair<T, Integer>(addVal, -1));
        vertices.add(addValHolder);
        return true;
    }

    public boolean addEdge(T edgeRoot, T edgeEnd, int weight) {
        if (weight < 0) {
            return false;
        }
        if (this.contains(edgeRoot) && this.contains(edgeEnd)) {
            List<Pair<T, Integer>> rootNode = findNode(edgeRoot);
            rootNode.add(new Pair<T, Integer>(edgeEnd, weight));

            List<Pair<T, Integer>> endNode = findNode(edgeEnd);
            endNode.add(new Pair<T, Integer>(edgeRoot, weight));

            return true;
        } else {
            return false;
        }
    }

    public List<Pair<T, Integer>> findNeighbors(T targetNode) {
        ArrayList<Pair<T, Integer>> targetList = (ArrayList<Pair<T, Integer>>) findNode(targetNode);
        List<Pair<T, Integer>> output = new ArrayList<Pair<T, Integer>>();

        for (Pair<T, Integer> pair : targetList) {
            if (pair.keyB != -1) {
                output.add(
                        new Pair<T, Integer>(
                                pair.keyA,
                                pair.keyB
                        )
                );
            }
        }
        return output;
    }

    protected List<Pair<T, Integer>> findNode(T targetValue) {
        for (List<Pair<T, Integer>> list : vertices) {
            if (targetValue.equals(list.get(0).keyA)) {
                return list;
            }
        }
        return null;
    }

    /**
     * Returns a new list of all nodes
     *
     * @return
     */
    public List<T> getNodes() {
        List<T> output = new ArrayList<>();

        for (List<Pair<T, Integer>> list : vertices) {
            output.add(list.get(0).keyA);
        }

        return output;
    }

    public boolean contains(T targetVal) {
        for (List<Pair<T, Integer>> val : vertices) {
            if (val.get(0).keyA.equals(targetVal)) {
                return true;
            }

        }
        return false;
    }

    public int size() {
        return vertices.size();
    }
}
