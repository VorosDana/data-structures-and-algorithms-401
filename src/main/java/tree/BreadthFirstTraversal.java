package tree;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.List;

public abstract class BreadthFirstTraversal {
    public static <T> List<T> breadthTraverse(BinaryTree<T> t) {
        List<T> output = new ArrayList<>();
        Queue<Node<T>> q = new Queue<>();

        q.enqueue(t.root);

        while (q.peek() != null) {
            Node<T> current = q.dequeue();
            output.add(current.getVal());

            if (current.getLeft() != null) {
                q.enqueue(current.getLeft());
            }
            if (current.getRight() != null) {
                q.enqueue(current.getRight());
            }
        }

        return output;
    }
}
