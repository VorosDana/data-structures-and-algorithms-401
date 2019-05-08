package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testContructor() {
        BinaryTree<Integer> test = new BinaryTree<>();

        List<Integer> preOrder = test.preOrderTraversal();
        assertEquals(0, preOrder.size());

        List<Integer> inOrder = test.inOrderTraversal();
        assertEquals(0, inOrder.size());

        List<Integer> postOrder = test.postOrderTraversal();
        assertEquals(0, postOrder.size());
    }

    @Test
    public void testOneElementTree() {
        List<Integer> testContents = new ArrayList<>();
        testContents.add(10);

        BinaryTree<Integer> test = new BinaryTree<>(testContents);


        List<Integer> preOrder = test.preOrderTraversal();
        assertEquals(1, preOrder.size());
        assertEquals(testContents, preOrder);

        List<Integer> inOrder = test.inOrderTraversal();
        assertEquals(1, inOrder.size());
        assertEquals(testContents, inOrder);

        List<Integer> postOrder = test.postOrderTraversal();
        assertEquals(1, postOrder.size());
        assertEquals(testContents, postOrder);
    }

    @Test
    public void testTenElementTree() {
        List<Integer> testContents = new ArrayList<>();
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);
        testContents.add(10);

        BinaryTree<Integer> test = new BinaryTree<>(testContents);


        List<Integer> preOrder = test.preOrderTraversal();
        assertEquals(10, preOrder.size());
        assertEquals(testContents, preOrder);

        List<Integer> inOrder = test.inOrderTraversal();
        assertEquals(10, inOrder.size());
        assertEquals(testContents, inOrder);

        List<Integer> postOrder = test.postOrderTraversal();
        assertEquals(10, postOrder.size());
        assertEquals(testContents, postOrder);
    }
    

}