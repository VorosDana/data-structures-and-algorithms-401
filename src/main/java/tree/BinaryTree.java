package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BinaryTree<T> {
    protected Node<T> root;

    public BinaryTree() {
        super();
    }

    public BinaryTree(Collection<T> vals) {
        java.util.Queue<T> valsQ = new java.util.PriorityQueue<>(vals);
        this.root = new Node<>();
        this.root.setVal(valsQ.remove());
        Queue<Node<T>> q = new Queue<>();
        q.enqueue(this.root);

        while (!valsQ.isEmpty()) {
            Node<T> current = q.dequeue();

            if (!valsQ.isEmpty()) {
                current.setLeft(new Node<T>());
                current.getLeft().setVal(valsQ.remove());
            }

            if (!valsQ.isEmpty()) {
                current.setRight(new Node<T>());
                current.getRight().setVal(valsQ.remove());
            }


            q.enqueue(current.getLeft());
            q.enqueue(current.getRight());
        }
    }

    public List<T> preOrderTraversal() {
        List<T> output = new ArrayList<>();

        if (this.root != null) {
            preOrderInternal(this.root, output);
        }

        return output;
    }

    private void preOrderInternal(Node<T> current, List<T> output) {
        output.add(current.getVal());
        if (current.getLeft() != null) {
            preOrderInternal(current.getLeft(), output);
        }
        if (current.getRight() != null) {
            preOrderInternal(current.getRight(), output);
        }
    }

    public List<T> inOrderTraversal() {
        List<T> output = new ArrayList<>();

        if (this.root != null) {
            inOrderInternal(this.root, output);
        }
        return output;
    }

    private void inOrderInternal(Node<T> current, List<T> output) {

        if (current.getLeft() != null) {
            inOrderInternal(current.getLeft(), output);
        }
        output.add(current.getVal());
        if (current.getRight() != null) {
            inOrderInternal(current.getRight(), output);
        }
    }

    public List<T> postOrderTraversal() {
        List<T> output = new ArrayList<>();

        if (this.root != null) {
            postOrderInternal(this.root, output);
        }
        return output;
    }

    private void postOrderInternal(Node<T> current, List<T> output) {

        if (current.getLeft() != null) {
            postOrderInternal(current.getLeft(), output);
        }
        if (current.getRight() != null) {
            postOrderInternal(current.getRight(), output);
        }
        output.add(current.getVal());
    }

}
