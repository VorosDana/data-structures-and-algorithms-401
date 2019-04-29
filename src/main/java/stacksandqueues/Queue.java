package stacksandqueues;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public void enqueue(T newValue) {
        Node<T> newNode = new Node<>();
        newNode.value = newValue;
        if (this.front == null) {
            newNode.next = null;
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public T dequeue() {
        // peek value is same as return from dequeue, use the same thing
        T output = this.peek();
        if (output != null) {
            Node<T> holder = this.front;
            this.front = this.front.next;
            holder.next = null;
        } else if (this.front == this.rear) {
            this.front = null;
            this.rear = null;
        }
        return output;
    }

    public T peek() {
        if (this.front != null) {
            return this.front.value;
        }
        return null;
    }
}
