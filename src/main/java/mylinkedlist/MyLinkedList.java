package mylinkedlist;

import java.util.ArrayList;

public class MyLinkedList<T> {
    private Node head;
//    private Node current;

    public MyLinkedList(T initialValue) {
        this.head = new Node(initialValue);
    }

    public MyLinkedList() {
        this.head = null;
    }

    private class Node {
        private T value;
        private Node next;

        private Node(T value) {

            this.value = value;
        }
    }

    public T getHeadValue() {
        return head.value;
    }

    public void insert(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }


    /**
     * @param value Attaches a new node with the provided value to the tail of the linked list.
     *              If the list is empty, functions identically to insert
     */
    public void append(T value) {
        Node newNode = new Node(value);

        // If list is empty, head is the end, put the node there
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the tail
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach node to the tail
        current.next = newNode;
    }

    /**
     * @param newValue
     * @param targetValue
     * @return insertSuccess
     * <p>
     * Inserts a new Node containing newValue in front of
     * a node containing targetValue, fails if it can't
     * find a Node containing targetValue.
     * <p>
     * Returns true if element was inserted, false if insert failed.
     */
    public boolean insertBefore(T newValue, T targetValue) {

        // If list is empty, can't find targetValue, escape to avoid null reference errors
        if (head == null) {
            return false;
        }

        // Special case for one element linked list
        if (head.next == null && head.value.equals(targetValue)) {
            Node newNode = new Node(newValue);
            newNode.next = head;
            head = newNode;
            return true;
        }

        // Find the targetValue, or break when there are no more options
        Node current = head;
        while (current.next != null && !current.next.value.equals(targetValue)) {
            current = current.next;
        }

        // If following node is not present, we broke the loop
        // because we were at the tail, no value to insert in front of
        if (current.next == null) {
            return false;
        }

        // Insert new element
        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    public boolean insertAfter(T newValue, T targetValue) {

        // If list is empty, can't find targetValue, escape to avoid null reference errors
        if (head == null) {
            return false;
        }

        // Find the targetValue, or break when there are no more options
        Node current = head;
        while (current != null && !current.value.equals(targetValue)) {
            current = current.next;
        }

        // If current element is null, value was not found.
        // No appropriate value to insert after.
        if (current == null) {
            return false;
        }

        // Insert new element
        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    public boolean contains(T value) {
        Node current = head;

        // Search through until we find either the right value, or the end of the list
        while (current != null) {

            if (current.value.equals(value)) {
                return true;
            }

            current = current.next;
        }


        return false;
    }

    public ArrayList print() {
        ArrayList<T> output = new ArrayList<>();
        Node current = head;
        while (current != null) {
            output.add(current.value);
            current = current.next;
        }

        return output;
    }
}
