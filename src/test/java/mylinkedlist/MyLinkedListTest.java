package mylinkedlist;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testEmptyList() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        ArrayList testListPrinted = testList.print();

        assertEquals("", printArrayList(testListPrinted));
    }

    @Test
    public void testInsertA() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(125);
        testList.insert(672809);

        ArrayList<Integer> testListPrinted = testList.print();

        String expected = "672809\n" +
                "125\n";

        assertEquals(expected, printArrayList(testListPrinted));
    }

    @Test
    public void testInsertB() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6732);
        testList.insert(2346);
        testList.insert(57893420);
        testList.insert(5734289);
        testList.insert(578349);

        ArrayList<Integer> testListPrinted = testList.print();

        String expected = "578349\n" +
                "5734289\n" +
                "57893420\n" +
                "2346\n" +
                "6732\n";


        assertEquals(expected, printArrayList(testListPrinted));
    }

    @Test
    public void testHeadReference() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        testList.insert(2345);
        testList.insert(45178);
        testList.insert(165);

        int expected = 165;
        int actual = testList.getHeadValue();

        assertEquals(expected, actual);
    }

    @Test
    public void containsTrue() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        testList.insert(2345);
        testList.insert(45178);
        testList.insert(165);

        assertTrue(testList.contains(2345));
    }

    @Test
    public void containsFalse() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        testList.insert(2345);
        testList.insert(45178);
        testList.insert(165);

        assertFalse(testList.contains(2346));
    }

    @Test
    public void testAppend() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        testList.insert(2345);
        testList.insert(45178);
        testList.append(165);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(45178);
        expected.add(2345);
        expected.add(165);

        assertEquals(expected, testList.print());
    }

    // revealed error in empty list append break
    @Test
    public void testAppendEmptyList() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.append(643);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(643);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertBeforeSuccessSingleElementList() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        assertTrue(testList.insertBefore(1259, 6236));

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1259);
        expected.add(6236);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertBeforeSuccess() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        testList.insert(53);
        assertTrue(testList.insertBefore(1259, 6236));

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(53);
        expected.add(1259);
        expected.add(6236);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertBeforeFailure() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        testList.insert(53);
        assertFalse(testList.insertBefore(1259, 623));

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(53);
        expected.add(6236);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertAfterSuccessSingleElementList() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        assertTrue(testList.insertAfter(1259, 6236));

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(6236);
        expected.add(1259);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertAfterSuccess() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        testList.insert(53);
        assertTrue(testList.insertAfter(1259, 6236));

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(53);
        expected.add(6236);
        expected.add(1259);

        assertEquals(expected, testList.print());
    }

    @Test
    public void testInsertAfterFailure() {
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.insert(6236);
        testList.insert(53);
        assertFalse(testList.insertAfter(1259, 636));

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(53);
        expected.add(6236);


        assertEquals(expected, testList.print());
    }

    /*
            Helper functions
     -------------------------------------------------------------------
     */

    public String printArrayList(ArrayList input) {
        String output = "";

        for (Object element : input) {
            output += element.toString() + "\n";
        }


        return output;
    }

}