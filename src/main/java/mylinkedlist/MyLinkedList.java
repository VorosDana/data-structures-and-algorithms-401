package mylinkedlist;

import java.util.ArrayList;

public class MyLinkedList<T> {
    protected Node<T> head;
//    private Node current;

    /**
     * Convenience constructor, creates a MyLinkedList with
     * a node built.
     *
     * @param initialValue
     */
    public MyLinkedList(T initialValue) {
        this.head = new Node(initialValue);
    }

    /**
     * Basic constructor, makes an empty MyLinkedList
     */
    public MyLinkedList() {
        this.head = null;
    }

    /**
     * Internal use Node class
     *
     * @param <T>
     */
    protected class Node<T> {
        protected T value;
        protected Node<T> next;

        protected Node(T value) {

            this.value = value;
        }
    }

    /**
     * Does what it says on the tin.
     *
     * @return
     */
    public T getHeadValue() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public void insert(T value) {
        Node<T> newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }


    /**
     * Attaches a new node with the provided value to the tail of the linked list.
     * If the list is empty, functions identically to insert
     *
     * @param value
     */
    public void append(T value) {
        Node<T> newNode = new Node(value);

        // If list is empty, head is the end, put the node there
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the tail
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach node to the tail
        current.next = newNode;
    }

    /**
     * Inserts a new Node containing newValue in front of
     * a node containing targetValue, fails if it can't
     * find a Node containing targetValue.
     * <p>
     * Returns true if element was inserted, false if insert failed.
     *
     * @param newValue
     * @param targetValue
     * @return insertSuccess
     */
    public boolean insertBefore(T newValue, T targetValue) {

        // If list is empty, can't find targetValue, escape to avoid null reference errors
        if (head == null) {
            return false;
        }

        // Special case for one element linked list
        if (head.next == null && head.value.equals(targetValue)) {
            Node<T> newNode = new Node(newValue);
            newNode.next = head;
            head = newNode;
            return true;
        }

        // Find the targetValue, or break when there are no more options
        Node<T> current = head;
        while (current.next != null && !current.next.value.equals(targetValue)) {
            current = current.next;
        }

        // If following node is not present, we broke the loop
        // because we were at the tail, no value to insert in front of
        if (current.next == null) {
            return false;
        }

        // Insert new element
        Node<T> newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    /**
     * Finds a Node containing targetValue, and inserts a new Node
     * containing newValue after it in the list.
     *
     * @param newValue
     * @param targetValue
     * @return
     */
    public boolean insertAfter(T newValue, T targetValue) {

        // If list is empty, can't find targetValue, escape to avoid null reference errors
        if (head == null) {
            return false;
        }

        // Find the targetValue, or break when there are no more options
        Node<T> current = head;
        while (current != null && !current.value.equals(targetValue)) {
            current = current.next;
        }

        // If current element is null, value was not found.
        // No appropriate value to insert after.
        if (current == null) {
            return false;
        }

        // Insert new element
        Node<T> newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    /**
     * Inserts a new node into the list.
     * k=0 inserts it at the end, target point counts up from there.
     * k<0 or k>=size throws an IndexOutOfBoundsException.
     * Should not be used for empty lists or for inserting at head, use insert instead.
     *
     * @param newValue
     * @param k
     * @throws IndexOutOfBoundsException
     */
    public void insertKthFromEnd(T newValue, int k) throws IndexOutOfBoundsException {
        if (k < 0 || k >= this.size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;

        for (int i = 1; i < this.size() - k; i++) {
            current = current.next;
        }

        Node<T> newNode = new Node<>(newValue);
        newNode.next = current.next;
        current.next = newNode;
    }

    /**
     * Searchs list for a Node containing value,
     * returns true if found, false if not.
     *
     * @param value
     * @return
     */
    public boolean contains(T value) {
        Node<T> current = head;

        // Search through until we find either the right value, or the end of the list
        while (current != null) {

            if (current.value.equals(value)) {
                return true;
            }

            current = current.next;
        }


        return false;
    }

    /**
     * Returns the size of the list.
     *
     * @return size
     */
    public int size() {
        Node current = head;
        int size = 0;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }


    /**
     * Returns an ArrayList containing the values of all nodes.
     * Mostly used for debugging.
     *
     * @return NodeContentsList
     */
    public ArrayList print() {
        ArrayList<T> output = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            output.add(current.value);
            current = current.next;
        }

        return output;
    }
}
