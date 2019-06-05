package util;

public class Pair<T, U> {
    public T keyA;
    public U keyB;

    public Pair(T keyA, U keyB) {
        this.keyA = keyA;
        this.keyB = keyB;
    }

    @Override
    public String toString() {
        String output = "<" +
                keyA.toString() +
                ", " +
                keyB.toString() + ">";

        return output;
    }

    //    @Override
    public boolean equals(Object compare) {
        if (this.getClass() != compare.getClass()) {
            return false;
        }

        return (this.keyA.equals(((Pair) compare).keyA) &&
                this.keyB.equals(((Pair) compare).keyB));
    }
}
