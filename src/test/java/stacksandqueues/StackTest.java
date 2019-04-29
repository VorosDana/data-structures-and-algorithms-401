package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void pushOne() {
        try {
            Stack<Integer> test = new Stack<>();
            test.push(10);
        } catch (Exception e) {
            fail("Failed to insert Integer");
        }


        try {
            Stack<String> test = new Stack<>();
            test.push("testo the test");
        } catch (Exception e) {
            fail("Failed to insert String");
        }

        try {
            Stack<Stack> test = new Stack<>();
            test.push(new Stack());
        } catch (Exception e) {
            fail("Failed to insert Stack");
        }
    }

    @Test
    public void pushMultiple() {
        try {
            Stack<Integer> test = new Stack<>();
            test.push(10);
        } catch (Exception e) {
            fail("Failed to insert first Integer");
        }

        try {
            Stack<Integer> test = new Stack<>();
            test.push(10);
        } catch (Exception e) {
            fail("Failed to insert second Integer");
        }

        try {
            Stack<Integer> test = new Stack<>();
            test.push(37);
        } catch (Exception e) {
            fail("Failed to insert third Integer");
        }
    }

    @Test
    public void popOne() {
        Stack<Integer> test = new Stack<>();
        test.push(10);

        assertEquals(new Integer(10), test.pop());


        Stack<String> testTwo = new Stack<>();
        testTwo.push("testo the test");


        assertEquals("testo the test", testTwo.pop());

        Stack<Character> testThree = new Stack<>();
        testThree.push('f');

        assertEquals(new Character('f'), testThree.pop());
    }

    @Test
    public void popAll() {
        Stack<Integer> test = new Stack<>();
        test.push(31);
        test.push(41);
        test.push(59);

        assertEquals(new Integer(59), test.pop());
        assertEquals(new Integer(41), test.pop());
        assertEquals(new Integer(31), test.pop());
        assertNull(test.pop());
    }

    @Test
    public void peek() {
        Stack<Integer> test = new Stack<>();
        test.push(10);

        assertEquals(new Integer(10), test.peek());


        Stack<String> testTwo = new Stack<>();
        testTwo.push("testo the test");


        assertEquals("testo the test", testTwo.peek());

        Stack<Character> testThree = new Stack<>();
        testThree.push('f');

        assertEquals(new Character('f'), testThree.peek());
    }

    @Test
    public void testNewStack() {
        Stack<Integer> test = new Stack<>();

        assertNull(test.peek());
        assertNull(test.pop());

        try {
            test.push(10);
        } catch (Exception e) {
            fail("Failed to push into new Stack");
        }
    }
}