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

    public String printArrayList(ArrayList input) {
        String output = "";

        for (Object element : input) {
            output += element.toString() + "\n";
        }


        return output;
    }

}