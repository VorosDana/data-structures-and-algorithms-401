package mylinkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListSmusherTest {

    @Test
    public void testMergeALarger() {
        MyLinkedList<Integer> listA = new MyLinkedList<>();
        MyLinkedList<Integer> listB = new MyLinkedList<>();

        listA.insert(5);
        listA.insert(3);
        listA.insert(1);

        listB.insert(4);
        listB.insert(2);

        System.out.println(listA.print());
        System.out.println(listB.print());

        MyLinkedList<Integer> output = LinkedListSmusher.merge(listA, listB);

        System.out.println(output.print());

        MyLinkedList<Integer> expectedOutput = new MyLinkedList<Integer>();
        expectedOutput.insert(5);
        expectedOutput.insert(4);
        expectedOutput.insert(3);
        expectedOutput.insert(2);
        expectedOutput.insert(1);

        System.out.println(expectedOutput.print());

        assertEquals(expectedOutput.print(), output.print());
        assertEquals(listA.getHeadValue(), null);
        assertEquals(listB.getHeadValue(), null);
    }

    @Test
    public void testMergeBLarger() {
        MyLinkedList<Integer> listA = new MyLinkedList<>();
        MyLinkedList<Integer> listB = new MyLinkedList<>();

        listA.insert(5);
        listA.insert(3);
        listA.insert(1);

        listB.insert(4);
        listB.insert(2);

        System.out.println(listA.print());
        System.out.println(listB.print());

        MyLinkedList<Integer> output = LinkedListSmusher.merge(listB, listA);

        System.out.println(output.print());

        MyLinkedList<Integer> expectedOutput = new MyLinkedList<Integer>();
        expectedOutput.insert(5);
        expectedOutput.insert(3);
        expectedOutput.insert(4);
        expectedOutput.insert(1);
        expectedOutput.insert(2);

        System.out.println(expectedOutput.print());

        assertEquals(expectedOutput.print(), output.print());
        assertEquals(listA.getHeadValue(), null);
        assertEquals(listB.getHeadValue(), null);
    }

    @Test
    public void testNullList() {
        MyLinkedList<Integer> listA = new MyLinkedList<>();
        MyLinkedList<Integer> listB = null;

        listA.insert(5);
        listA.insert(3);
        listA.insert(1);
        try {
            MyLinkedList<Integer> output = LinkedListSmusher.merge(listB, listA);
            fail();
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
}