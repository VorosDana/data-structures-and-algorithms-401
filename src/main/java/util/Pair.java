package util;

/**
 * Basic tuple class, holds two objects, types can be defined independently.
 *
 * @param <T> key A
 * @param <U> key B
 */
public class Pair<T, U> {

    private T keyA;
    private U keyB;

    /**
     * Parameterized constructor. Empty constructor is not needed because the entire purpose
     * of the class is to hold two items. If the user needs nulls, they can do that themself.
     *
     * @param keyA first parameter
     * @param keyB second parameter
     */
    public Pair(T keyA, U keyB) {
        this.keyA = keyA;
        this.keyB = keyB;
    }

    public void setKeyA(T keyA){
        this.keyA = keyA;
    }

    public void setKeyB(U keyB){
        this.keyB = keyB;
    }

    public T getKeyA(){
        return keyA;
    }

    public U getKeyB(){
        return keyB;
    }

    /**
     * Calls .toString on each component and returns them in the format "<A, B>"
     *
     * @return Combined .toString() of both items
     */
    @Override
    public String toString() {
        return "<" +
                keyA.toString() +
                ", " +
                keyB.toString() + ">";
    }

    /**
     * Attempts to implement .equals() for the entire unit. Has worked in unit testing.
     * @param compare Object to compare to
     * @return Returns true if class of this and class of compare match,this.keyA and compare.keyA match,
     * and this.keyB and compare.keyB match. Contents matching requires the object to have a functional .equals().
     */
    @Override
    public boolean equals(Object compare) {
        if (this.getClass() != compare.getClass()) {
            return false;
        }

        return (this.keyA.equals(((Pair) compare).getKeyA()) &&
                this.keyB.equals(((Pair) compare).getKeyB()));
    }
}
