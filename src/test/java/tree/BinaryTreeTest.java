package tree;

import org.junit.Test;

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


}