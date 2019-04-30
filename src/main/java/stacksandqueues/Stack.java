package stacksandqueues;

public class Stack<T> {
    private Node<T> top;

    public void push(T newValue) {
        Node<T> newNode = new Node<>();
        newNode.next = top;
        newNode.value = newValue;
        this.top = newNode;
    }

    public T pop() {
        if (this.top == null) {
            return null;
        }
        T output = this.top.value;
        Node<T> holder = this.top;
        this.top = this.top.next;
        holder.next = null;
        return output;
    }

    public T peek() {
        if (this.top == null) {
            return null;
        }
        return this.top.value;
    }
}
