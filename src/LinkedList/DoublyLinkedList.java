package LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    /*
    Given a node, we can navigate lists in both forward and backward direction, which is not possible with a singly linked list.
    A Node in SLL can only be deleted if we have a pointer to its previous node. But in Doubly LInked list we can delete the node even if we
    don't have a pointer to its previous node.

    DLNode:
    NULL <--| prev | data | next |--> NULL
     */

    private DLNode head;
    private DLNode tail;
    private int length;

    /**
     * Constructer
     *
     * @param head
     * @param tail
     * @param length
     */
    public DoublyLinkedList(DLNode head, DLNode tail, int length){
        this.head = head;
        this.tail = tail;
        this.length = 0;
    }

    public void insertLast(int val){

        DLNode newNode = new DLNode(null, null, val);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    /**
     * Inserts a node at the beginning of the linked list.
     *
     * @param val
     */
    public void insertFirst(int val){
        DLNode newNode = new DLNode(null, null, val);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //    NULL <--| prev | data | next |-->  newnode --> null
    /**
     * My own iteration of the insertAtEnd method
     *
     * @param val
     */
    public void insertAtEnd(int val){
        DLNode newNode = new DLNode(null, null, val);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
        }
        length++;
    }

    //   NULL <--head <-->| prev | data | next | --> null

    /**
     * This method deletes the first node in the linked list.
     * If our linked list is of length 1, then we may just set our tail to null.
     */
    public void deleteFirstNode(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        //edge case, if only one value is there
        if (head == tail) {
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        length--;
    }

    //   NULL <--head <-->| prev | data | next | --> tail --> null
    public DLNode deleteLastNode(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        DLNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        length--;
        return temp;
    }


    /**
     * This method prints the nodes in our linked list in forward fashion.
     */
    public void displayForward(){
        if (head == null) return;

        DLNode current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    /**
     * Prints all the nodes in backwards fashion.
     */
    public void displayBackward(){
        if (tail == null) return;
        DLNode current = tail;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    /**
     * @return True if the list is empty, otherwise False if the length exceeds 0.
     */
    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    /**
     * Doubly Linked List Node class, containing previous, next and the value.
     */
    private class DLNode {
        private DLNode prev, next;
        private int value;

        public DLNode(DLNode p, DLNode n, int v){
            this.prev = p;
            this.next = n;
            this.value = v;
        }


    }
}
