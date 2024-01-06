package practice.linkedList;

public class Node <E> {


    // fields
    Node<E> prev; // тип Node - взят от Java
    E data;
    Node<E> next;

    // constructor
    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
