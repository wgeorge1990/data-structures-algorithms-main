package com.wgdevelopment;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; // head
    private Node last;  // tail

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        // if list is empty add first node
        if (isEmpty())
            first = last = node;
        // else prepend item to the list
        else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
