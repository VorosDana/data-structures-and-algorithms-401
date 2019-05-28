package tree;

import stacksandqueues.Queue;

public abstract class BinaryTreeMax {
    public static Integer findTreeMax(BinaryTree<Integer> t) {
        Integer max = new Integer(Integer.MIN_VALUE);
        Queue<Node<Integer>> q = new Queue<>();

        if (t.root != null) {
            q.enqueue(t.root);
        }

        while (q.peek() != null) {
            Node<Integer> current = q.dequeue();

            if (max.compareTo(current.getVal()) < 0) {
                max = current.getVal();
            }

            if (current.getLeft() != null) {
                q.enqueue(current.getLeft());
            }

            if (current.getRight() != null) {
                q.enqueue(current.getRight());
            }
        }

        return max;
    }
}
