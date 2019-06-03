package graph;

import org.junit.Test;
import util.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class graphTest {

    @Test
    public void testConstructor() {
        Graph<Integer> testo = new Graph<>();

        assertNotNull("Graph needs to exist", testo);
        assertNotNull("Graph needs to have instantiated collection of vertices", testo.vertices);
        assertEquals("Graph's vertices should match class ArrayList<Pair<Integer, Integer>>>",
                ArrayList.class,
                testo.vertices.getClass()
        );
    }

    @Test
    public void testGraphLifeCycle() {
        Graph<Integer> testo = new Graph<>();

        testo.addNode(5);

        assertTrue(testo.addNode(10));
        assertFalse(testo.addNode(5));

        testo.addEdge(5, 10, 1);

        List<Pair<Integer, Integer>> neighbors = testo.findNeighbors(5);
        assertEquals("There should be precisely 1 neighbor to 5", 1, neighbors.size());

        assertTrue(testo.addNode(7));

        assertTrue(testo.addEdge(7, 10, 2));
        List<Pair<Integer, Integer>> neighborsOfTen = testo.findNeighbors(10);
        assertEquals(2, neighborsOfTen.size());
    }

}