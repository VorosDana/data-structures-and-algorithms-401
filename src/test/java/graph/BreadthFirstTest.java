package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTest {
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
    public void testTraversal() {
        List<Integer> output = BreadthFirst.breadthFirstTraversal(testo, 5);


        assertNotNull(output);
        assertEquals(5, output.size());
        assertTrue(output.contains(5));
        System.out.println(output);
    }

}