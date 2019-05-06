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
        return output;
    }

    public List<T> inOrderTraversal() {
        List<T> output = new ArrayList<>();
        return output;
    }

    public List<T> postOrderTraversal() {
        List<T> output = new ArrayList<>();
        return output;
    }
}
