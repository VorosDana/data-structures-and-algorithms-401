package mylinkedlist;

public class LinkedListSmusher {

    public static MyLinkedList merge(MyLinkedList listA, MyLinkedList listB) throws NullPointerException {
        if (listA == null || listB == null) {
            throw (new NullPointerException());
        }
        MyLinkedList newList = new MyLinkedList();

        MyLinkedList.Node currentA = listA.head.next;
        MyLinkedList.Node currentB = listB.head.next;

        newList.head = listA.head;
        newList.head.next = listB.head;
        MyLinkedList.Node tail = newList.head.next;


        while (currentA != null && currentB != null) {
            tail.next = currentA;
            currentA = currentA.next;
            tail = tail.next;

            tail.next = currentB;
            currentB = currentB.next;
            tail = tail.next;
        }

        if (currentB == null) {
            tail.next = currentA;
        }

        listA.head = null;
        listB.head = null;

        return newList;
    }
}
