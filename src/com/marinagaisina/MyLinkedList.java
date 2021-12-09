package com.marinagaisina;

public class MyLinkedList<E> {
    private Node top, bottom;
    private int size;
    public int size() {
        return size;
    }

    public void add(E value) {
        Node n = new Node(bottom, value);
        if (top == null) {
            top = bottom = n;
        } else {
            bottom.next = n;
            bottom = n;
        }
        size++;
    }

    private class Node {
        E value;
        Node next, prev;

        Node(Node prev, E value) {
            this.prev = prev;
            this.value = value;
        }
    }
}
