package tree;

import stacksandqueues.Queue;

import java.util.Collection;
import java.util.List;

public class BinarySearchTree<T> {
    private Node<T> root;

    public BinarySearchTreeTree() {
        super();
    }

    public BinarySearchTree(Collection<T> vals) {
        java.util.Queue<T> valsQ = new java.util.PriorityQueue<>(vals);
        this.root = new Node<>();
        Queue<Node<T>> q = new Queue<>();
        q.enqueue(this.root);

        while (!valsQ.isEmpty()) {
            Node<T> current = q.dequeue();
            current.setVal(valsQ.remove());
            current.setLeft(new Node<T>());
            current.setRight(new Node<T>());
            q.enqueue(current.getLeft());
            q.enqueue(current.getRight());
        }
    }

    public void add(T val) {

    }

    public boolean contains(T val) {
        return false;
    }
}
