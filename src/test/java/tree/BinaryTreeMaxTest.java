package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeMaxTest {

    @Test
    public void testEmptyTree() {
        BinaryTree<Integer> testo = new BinaryTree<>();

        assertNotNull(testo);
        assertNull(testo.root);
        assertEquals(
                Integer.MIN_VALUE,
                (int) BinaryTreeMax.findTreeMax(testo)
        );
    }

    @Test
    public void testSmallTree() {
        List<Integer> testoContents = new ArrayList<>();

        testoContents.add(10);
        testoContents.add(156);
        testoContents.add(164);
        testoContents.add(62);
        testoContents.add(7534);
        testoContents.add(2345);
        testoContents.add(754);
        testoContents.add(137);
        testoContents.add(9435);

        BinaryTree<Integer> testo = new BinaryTree<>(testoContents);

        assertEquals(9435, (int) BinaryTreeMax.findTreeMax(testo));

        List<Integer> preOrderTesto = testo.preOrderTraversal();

        assertEquals(testoContents.size(), preOrderTesto.size());

        Integer[] preOrderTestoArray = new Integer[]{5};
        preOrderTestoArray = preOrderTesto.toArray(preOrderTestoArray);

        Arrays.sort(preOrderTestoArray);
        assertEquals(9435, (int) preOrderTestoArray[preOrderTestoArray.length - 1]);
    }

    @Test
    public void testLargeTree() {
        List<Integer> testoContents = new ArrayList<>();

        testoContents.add(10);
        testoContents.add(156);
        testoContents.add(164);
        testoContents.add(62);
        testoContents.add(7534);
        testoContents.add(2345);
        testoContents.add(754);
        testoContents.add(137);
        testoContents.add(9435);
        testoContents.add(5432);
        testoContents.add(71532);
        testoContents.add(634275);
        testoContents.add(54326);
        testoContents.add(6234);
        testoContents.add(634);
        testoContents.add(678);
        testoContents.add(8765);
        testoContents.add(2375);
        testoContents.add(37865);
        testoContents.add(5432);
        testoContents.add(14633);
        testoContents.add(1754);
        testoContents.add(1745);
        testoContents.add(1364);

        BinaryTree<Integer> testo = new BinaryTree<>(testoContents);

        assertEquals(634275, (int) BinaryTreeMax.findTreeMax(testo));

        List<Integer> preOrderTesto = testo.preOrderTraversal();

        assertEquals(testoContents.size(), preOrderTesto.size());

        Integer[] preOrderTestoArray = new Integer[]{5};
        preOrderTestoArray = preOrderTesto.toArray(preOrderTestoArray);

        Arrays.sort(preOrderTestoArray);
        assertEquals(634275, (int) preOrderTestoArray[preOrderTestoArray.length - 1]);
    }
}