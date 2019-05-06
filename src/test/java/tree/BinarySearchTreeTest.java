package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testEmptyBST() {
        BinarySearchTree test = new BinarySearchTree();

        assertNull(test.root);
        assertFalse(test.contains(5));
    }

    @Test
    public void testBuildingBST() {
        BinarySearchTree test = new BinarySearchTree();

        try {
            test.add(5);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Failed to add value to empty BST");
        }

        assertTrue(test.contains(5));

        test.add(2);
        test.add(8);

        assertTrue(test.contains(2));
        assertTrue(test.contains(8));

        assertEquals("2 should be put to the left of 5", 2, (int) test.root.getLeft().getVal());
        assertEquals("8 should be put to the right of 5", 8, (int) test.root.getRight().getVal());
    }
}