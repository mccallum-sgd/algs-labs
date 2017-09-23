/******************************************************************************
 *  Compilation:  javac LinkedQueue.java
 *  Execution:    java LinkedQueue < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *  Data files:   http://algs4.cs.princeton.edu/13stacks/tobe.txt  
 *
 *  A generic queue, implemented using a singly-linked list.
 *
 *  % java Queue < tobe.txt 
 *  to be or not to be (2 left on queue)
 *
 ******************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<Item> implements Iterable<Item> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * Initializes an empty queue.
     */
    public LinkedQueue() {
        // what needs to be initialized here?
    }

    /**
     * Is this queue empty?
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     */
    public int size() {
        return n;     
    }


    /**
     * Adds the item to this queue.
     */
    public void enqueue(Item item) {
        // How to stick the item at the end of the list?
        // watch out for the special case of an empty list
        
    }

    /**
     * Removes and returns the item on this queue that was least recently added.
     */
    public Item dequeue() {
        // How do you get the item from the front of the list, 
        // and ensure that the next element is now the front?
        // Watch out for empty queue

        Item item = ?;
        
    }

    /**
     * Returns an iterator that iterates over the items in this queue in FIFO order.
     */
    public Iterator<Item> iterator()  {
        return new ListIterator();  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public void remove()      { throw new UnsupportedOperationException();  }
        
        public boolean hasNext()  { 
            // how to check if the iterator still has more things to work with?                     
        }

        public Item next() {
            // how to walk along the list, starting from first ?
            // watch out for next() call when there is no next item
        }
    }


    /**
     * Unit tests the LinkedQueue data type.
     */
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
    }
}
