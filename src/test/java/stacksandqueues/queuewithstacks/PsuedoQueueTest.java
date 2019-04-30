package stacksandqueues.queuewithstacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PsuedoQueueTest {

    @Test
    public void enqueueOne() {
        PsuedoQueue<Integer> test = new PsuedoQueue<>();
        try {
            test.enqueue(10);
        } catch (Exception e) {
            fail("Failed to enqueue Integer");
        }

        PsuedoQueue<String> testTwo = new PsuedoQueue<>();
        try {
            testTwo.enqueue("testo the test");
        } catch (Exception e) {
            fail("Failed to enqueue String");
        }

        PsuedoQueue<Character> testThree = new PsuedoQueue<>();
        try {
            testThree.enqueue('f');
        } catch (Exception e) {
            fail("Failed to enqueue Integer");
        }
    }

    @Test
    public void enqueueSeveral() {
        PsuedoQueue<Integer> test = new PsuedoQueue<>();

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
        PsuedoQueue<Integer> test = new PsuedoQueue<>();

        test.enqueue(10);
        assertEquals(new Integer(10), test.dequeue());


        PsuedoQueue<String> testTwo = new PsuedoQueue<>();

        testTwo.enqueue("testo the test");
        assertEquals("testo the test", testTwo.dequeue());

        PsuedoQueue<Character> testThree = new PsuedoQueue<>();

        testThree.enqueue('f');
        assertEquals(new Character('f'), testThree.dequeue());
    }

    @Test
    public void emptyQueue() {
        PsuedoQueue<Integer> test = new PsuedoQueue<>();

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
        PsuedoQueue<Integer> test = new PsuedoQueue<>();

        test.enqueue(10);
        assertEquals(new Integer(10), test.peek());

        test.enqueue(15);
        assertEquals(new Integer(10), test.peek());

        test.enqueue(27);
        assertEquals(new Integer(10), test.peek());
    }

    @Test
    public void testNewQueue() {
        PsuedoQueue<Integer> test = new PsuedoQueue<>();

        assertNull(test.dequeue());
        assertNull(test.peek());
        try {
            test.enqueue(5);
        } catch (Exception e) {
            fail("Failed to insert into new queue");
        }
    }
}