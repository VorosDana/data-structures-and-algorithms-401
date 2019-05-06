package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        super();
    }

    public BinaryTree(Collection<T> vals) {
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

    public List<T> preOrderTraversal() {
        List<T> output = new ArrayList<>();

        preOrderInternal(this.root, output);

        return output;
    }

    private void preOrderInternal(Node<T> current, List<T> output) {
        output.add(current.getVal());
        preOrderInternal(current.getLeft(), output);
        preOrderInternal(current.getRight(), output);
    }

    public List<T> inOrderTraversal() {
        List<T> output = new ArrayList<>();

        inOrderInternal(this.root, output);

        return output;
    }

    private void inOrderInternal(Node<T> current, List<T> output) {
        output.add(current.getVal());
        inOrderInternal(current.getLeft(), output);
        inOrderInternal(current.getRight(), output);
    }

    public List<T> postOrderTraversal() {
        List<T> output = new ArrayList<>();

        postOrderInternal(this.root, output);

        return output;
    }

    private void postOrderInternal(Node<T> current, List<T> output) {
        output.add(current.getVal());
        postOrderInternal(current.getLeft(), output);
        postOrderInternal(current.getRight(), output);
    }

}
