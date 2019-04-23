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
