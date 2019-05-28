package hashes;

import java.lang.reflect.Array;

public class HashMap<T> {
    protected Node[] buckets;

    public HashMap(int buckets) {
        // courtesy of Stack Overflow user Varkhan
        // https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
        final Node[] temp = (Node[]) Array.newInstance(Node.class, buckets);

        this.buckets = temp;
    }

    // fallback to 30 buckets
    public HashMap() {
        this(30);
    }

    private int hash(String key) {
        char[] chars = key.toCharArray();
        int total = 0;
        for (char letter : chars) {
            total += (int) letter;
        }

        total *= 73;

        return total % buckets.length;
    }

    // returns a boolean indicating success of the insert
    public boolean add(String key, T value) {
        if (value == null) {
            return false;
        }
        int hashedKey = hash(key);

        // start with head, name for node because
        // we'll keep using the same variable
        // in the while loop
        Node hashBucketNode = buckets[hashedKey];

        if (hashBucketNode == null) {
            buckets[hashedKey] = new Node<T>(key, value);
            return true;
        }

        // check head node first
        if (hashBucketNode.key.equals(key)) {
            return false;
        }

        // iterate through until we find either a
        // duplicate key, or the end
        while (hashBucketNode.next != null) {
            if (hashBucketNode.next.key.equals(key)) {
                return false;
            }
            hashBucketNode = hashBucketNode.next;
        }

        hashBucketNode.next = new Node<T>(key, value);

        return true;
    }

    // returns either the value, or null if not found
    public T get(String key) {
        int targetHash = hash(key);
        Node<T> hashBucketNode = buckets[targetHash];

        if (hashBucketNode == null) {
            return null;
        }

        // have to check the head node seperately
        // could have implemented Iterable and made
        // it for each compatible, but that's WAY too much work
        if (hashBucketNode.key.equals(key)) {
            return hashBucketNode.value;
        }

        while (hashBucketNode.next != null) {
            if (hashBucketNode.next.key.equals(key)) {
                // called the item object, do not know why
                // will monitor in tests
                return (T) hashBucketNode.next.value;
            }
        }

        return null;
    }

    public boolean contains(String key) {
        return (get(key) != null);
    }

    private class Node<T> {
        protected String key;
        protected T value;
        protected Node next;

        protected Node(String key, T value) {
            this.key = key;
            this.value = value;
        }
    }
}
