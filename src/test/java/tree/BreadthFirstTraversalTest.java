package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTraversalTest {
    @Test
    public void testEmptyTree() {
        BinaryTree<Integer> testo = new BinaryTree<>();

        List<Integer> actual = BreadthFirstTraversal.breadthTraverse(testo);

        assertEquals(0, actual.size());
        assertNull(testo.root);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void testFancyTree() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6542);
        expected.add(252);
        expected.add(826);
        expected.add(2542);
        expected.add(2786425);
        expected.add(2341);
        expected.add(17164);
        expected.add(76435);
        expected.add(5534252);
        expected.add(16354);

        BinaryTree<Integer> testo = new BinaryTree<>(expected);
        List<Integer> actual = BreadthFirstTraversal.breadthTraverse(testo);

        assertFalse(actual.isEmpty());
        assertEquals(expected.size(), actual.size());
        assertEquals(expected, actual);
    }
}