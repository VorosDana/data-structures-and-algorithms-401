package hashes;

import org.junit.Test;
import tree.BinaryTree;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void intersection() {
        HashSet<Integer> elementsA = new HashSet<>();
        elementsA.add(5);
        elementsA.add(3);
        elementsA.add(48);
        elementsA.add(27);
        elementsA.add(40);
        elementsA.add(83);

        BinaryTree<Integer> treeA = new BinaryTree<>(elementsA);

        HashSet<Integer> elementsB = new HashSet<>();
        elementsB.add(5);
        elementsB.add(3);
        elementsB.add(8);
        elementsB.add(27);
        elementsB.add(10);

        BinaryTree<Integer> treeB = new BinaryTree<>(elementsB);

        HashSet<Integer> commonElements = new HashSet<>();
        commonElements.add(5);
        commonElements.add(3);
        commonElements.add(27);

        HashSet<Integer> methodResults = TreeIntersection.intersection(treeA, treeB);

        assertEquals(commonElements, methodResults);
        assertEquals(commonElements.size(), methodResults.size());
        assertEquals(commonElements.remove(3), methodResults.remove(3));
    }
}