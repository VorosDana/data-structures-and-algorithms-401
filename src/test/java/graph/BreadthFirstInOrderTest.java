package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstInOrderTest {
    Graph<Integer> testo;

    @Before
    public void setup() {
        testo = new Graph<>();

        testo.addNode(5);
        testo.addNode(10);
        testo.addNode(8);
        testo.addNode(6);
        testo.addNode(2);
        testo.addNode(4);
        testo.addNode(1);

        testo.addEdge(5, 10, 1);
        testo.addEdge(5, 8, 1);
        testo.addEdge(5, 6, 1);
        testo.addEdge(2, 10, 1);
    }

    @Test
    public void testDepthTraversal() {
        List<Integer> visited = BreadthFirstInOrder.traverse(testo, 5);
        List<Integer> expected = new ArrayList<>();

        // 5 is start node
        expected.add(5);
        // 5's first edge is 10
        expected.add(10);
        // 10 connects to 2
        expected.add(2);
        // the rest are direct edges to 5
        expected.add(8);
        expected.add(6);

        assertEquals(expected.size(), visited.size());
        assertEquals(expected.getClass(), visited.getClass());
        assertEquals(expected, visited);
    }
}