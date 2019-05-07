package tree;

import java.util.Collection;

public class FizzBuzzTree extends BinaryTree<Object> {
    public void fizzbuzz() {
        fizzbuzz(this.root);
    }

    public FizzBuzzTree(Collection<Object> vals) {
        super(vals);
    }

    private void fizzbuzz(Node n) {

        try {
            String typeTest = (String) n.getVal();
        } catch (ClassCastException e) {

            if ((int) n.getVal() % 15 == 0) {
                n.setVal("FizzBuzz");
            } else if ((int) n.getVal() % 3 == 0) {
                n.setVal("Fizz");
            } else if ((int) n.getVal() % 5 == 0) {
                n.setVal("Buzz");
            }
        }

        if (n.getLeft() != null) {
            fizzbuzz(n.getLeft());
        }

        if (n.getRight() != null) {
            fizzbuzz(n.getRight());
        }
    }
}
