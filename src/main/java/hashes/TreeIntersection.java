package hashes;

import tree.BinaryTree;

import java.util.HashSet;
import java.util.List;

public abstract class TreeIntersection {
    public static <T> HashSet<T> intersection(BinaryTree<T> a, BinaryTree<T> b) {
        List<T> elementsOfA = a.inOrderTraversal();
        List<T> elementsOfB = b.inOrderTraversal();

        HashMap<T> commonElements = new HashMap<>();
        HashSet<T> collisions = new HashSet<>();

        for (T t : elementsOfA) {
            commonElements.add(t.toString(), t);
        }
        for (T t : elementsOfB) {
            if (!commonElements.add(t.toString(), t)) {
                collisions.add(t);
            }
        }

        return collisions;
    }
}
