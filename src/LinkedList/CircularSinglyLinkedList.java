package LinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    /*
    Similar to the singly linked list, traversal to only one direction is possible but with a slight difference. The last node, in other words
    the tail, points to the first node in the linked list.
             |first| --> |node1| --> |node2| --> |tail| --> |first|
     */
    private CLLNode last;
    private int length;

    public CircularSinglyLinkedList(){
        this.last = null;
        this.length = 0;
    }

    /**
     * This method adds an element to the front of the cll. If the length is zero, then our new node should point to last.
     * The next node temp.next of our new node should point to the same node, where last.next was pointing prior to insertion.
     * last.next should be updatet, so it points to temp.
     *
     * @param data
     */
    public void insertAtFront(int data){
        CLLNode temp = new CLLNode(data);
        if (isEmpty()) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    /**
     * This method adds a data to the end of the linked list.
     * Base case: if node ist empty. Should last point to null, then we have to assign our last pointer to the temp node
     * and additionally the last.next to last.
     * In other cases we need to assign our temp.next pointer to the last.next pointer. Always make sure to point the new
     * pointers to the existing ones.
     *
     * @param data
     */
    public void insertAtEnd(int data){
        CLLNode temp = new CLLNode(data);
        if (isEmpty()) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    /**
     * This method deletes the element at the beginning of the list.
     * Two options here, other one is right below.
     */
    public void deleteAtFront(){
        CLLNode first = last.next;
        if (isEmpty()) {
            return;
        } else {
            last.next = first.next;
        }
        length--;
    }

    public void removeFirst(){
        CLLNode temp = last.next;

        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;

    }


    /**
     * Removes last element in the circular linked list.
     */
    public void deleteAtEnd(){
        CLLNode temp = last.next;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (last.next == last) {
            last = null;
        }
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp.next;
        length--;
    }


    /**
     * @return Is it empty TRUE, else FALSE.
     */
    public boolean isEmpty(){
        return length == 0;
    }

    /**
     * @return Only returns the size of the circular linked list.
     */
    public int length(){
        return length;
    }


    /**
     * Prints the circular linked list. Last is going to point to first again.
     */
    public void display(){
        if (last == null) {
            return;
        }
        CLLNode first = last.next;
        do {
            System.out.print(first.data + " --> ");
            first = first.next;
        } while (first != last.next);

        System.out.println("[first node] " + first.data);

    }

    public void createCircularLinkedList(){
        CLLNode first = new CLLNode(1);
        CLLNode second = new CLLNode(2);
        CLLNode third = new CLLNode(3);
        CLLNode fourth = new CLLNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }


    /**
     * Circular singly linked list Node class which is made out of the Node next and the key data.
     */
    class CLLNode {
        private CLLNode next;
        private int data;

        public CLLNode(int data){
            this.data = data;
        }
    }
}
