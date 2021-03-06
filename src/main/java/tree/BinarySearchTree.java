package tree;

import stacksandqueues.Queue;

import java.util.Collection;

public class BinarySearchTree {
    protected Node<Integer> root;

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(Collection<Integer> vals) {
        java.util.Queue<Integer> valsQ = new java.util.PriorityQueue<>(vals);
        this.root = new Node<>();
        Queue<Node<Integer>> q = new Queue<>();
        q.enqueue(this.root);

        while (!valsQ.isEmpty()) {
            Node<Integer> current = q.dequeue();
            current.setVal(valsQ.remove());
            current.setLeft(new Node<>());
            current.setRight(new Node<>());
            q.enqueue(current.getLeft());
            q.enqueue(current.getRight());
        }
    }

    public void add(Integer val) {
        if (this.root == null) {
            this.root = new Node<>();
            this.root.setVal(val);
            return;
        }

        Node<Integer> current = this.root;

        while (true) {
            if (val >= current.getVal()) {
                if (current.getRight() != null) {
                    current = current.getRight();
                } else {
                    Node<Integer> valNode = new Node<>();
                    valNode.setVal(val);
                    current.setRight(valNode);
                    return;
                }
            } else {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                } else {
                    Node<Integer> valNode = new Node<>();
                    valNode.setVal(val);
                    current.setLeft(valNode);
                    return;
                }
            }

        }
    }

    public boolean contains(Integer val) {
        Queue<Node<Integer>> q = new Queue<>();
        q.enqueue(this.root);

        while (q.peek() != null) {
            Node<Integer> current = q.dequeue();
            if (current.getVal().equals(val)) {
                return true;
            }

            if (current.getLeft() != null) {
                q.enqueue(current.getLeft());
            }

            if (current.getRight() != null) {
                q.enqueue(current.getRight());
            }
        }

        return false;
    }
}
