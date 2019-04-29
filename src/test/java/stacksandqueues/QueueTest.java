package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueueOne() {
        Queue<Integer> test = new Queue<>();
        try {
            test.enqueue(10);
        } catch (Exception e) {
            fail("Failed to enqueue Integer");
        }

        Queue<String> testTwo = new Queue<>();
        try {
            testTwo.enqueue("testo the test");
        } catch (Exception e) {
            fail("Failed to enqueue String");
        }

        Queue<Character> testThree = new Queue<>();
        try {
            testThree.enqueue('f');
        } catch (Exception e) {
            fail("Failed to enqueue Integer");
        }
    }

    @Test
    public void enqueueSeveral() {
        Queue<Integer> test = new Queue<>();

        try {
            test.enqueue(10);
        } catch (Exception e) {
            fail("Failed to enqueue first Integer");
        }

        try {
            test.enqueue(5);
        } catch (Exception e) {
            fail("Failed to enqueue second Integer");
        }

        try {
            test.enqueue(16);
        } catch (Exception e) {
            fail("Failed to enqueue third Integer");
        }
    }

    @Test
    public void dequeueOne() {
        Queue<Integer> test = new Queue<>();

        test.enqueue(10);
        assertEquals(new Integer(10), test.dequeue());


        Queue<String> testTwo = new Queue<>();

        testTwo.enqueue("testo the test");
        assertEquals("testo the test", testTwo.dequeue());

        Queue<Character> testThree = new Queue<>();

        testThree.enqueue('f');
        assertEquals(new Character('f'), testThree.dequeue());
    }

    @Test
    public void emptyQueue() {
        Queue<Integer> test = new Queue<>();

        test.enqueue(10);
        test.enqueue(15);
        test.enqueue(27);

        assertEquals(new Integer(10), test.dequeue());
        assertEquals(new Integer(15), test.dequeue());
        assertEquals(new Integer(27), test.dequeue());
        assertNull(test.dequeue());
    }

    @Test
    public void peek() {
        Queue<Integer> test = new Queue<>();

        test.enqueue(10);
        assertEquals(new Integer(10), test.peek());

        test.enqueue(15);
        assertEquals(new Integer(10), test.peek());

        test.enqueue(27);
        assertEquals(new Integer(10), test.peek());
    }

    @Test
    public void testNewQueue() {
        Queue<Integer> test = new Queue<>();

        assertNull(test.dequeue());
        assertNull(test.peek());
        try {
            test.enqueue(5);
        } catch (Exception e) {
            fail("Failed to insert into new queue");
        }
    }
}