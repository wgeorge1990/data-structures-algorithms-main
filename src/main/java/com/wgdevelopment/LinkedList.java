package com.wgdevelopment;

import java.util.NoSuchElementException;

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
    private int size;

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
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
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        //traverse list until we find node with value == item
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        // first -> 20
        // remove link to 10
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }else{
            var second = first.next;
            first.next = null;
            first = second;
            size--;
        }
    }

    public void removeLast() {
      if (isEmpty())
          throw new NoSuchElementException();

      if (first == last)
          first = last = null;
      else {
          var previous = getPrevious(last);
          last = previous;
          last.next = null;
          size--;
      }
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == last) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

}
