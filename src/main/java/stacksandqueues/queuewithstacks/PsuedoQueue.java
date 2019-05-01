package stacksandqueues.queuewithstacks;

import stacksandqueues.Stack;

public class PsuedoQueue<T> {
    Stack<T> storeStack;
    Stack<T> swapStack;

    public PsuedoQueue() {
        storeStack = new Stack<>();
        swapStack = new Stack<>();
    }

    public void enqueue(T newValue) {
        storeStack.push(newValue);
        while (swapStack.peek() != null) {
            storeStack.push(swapStack.pop());
        }
    }

    public T dequeue() {
        while (storeStack.peek() != null) {
            swapStack.push(storeStack.pop());
        }
        T output = swapStack.pop();

        return output;
    }

    public T peek() {
        while (storeStack.peek() != null) {
            swapStack.push(storeStack.pop());
        }
        T output = swapStack.peek();

        return output;
    }
}
