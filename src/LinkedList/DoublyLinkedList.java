package LinkedList;

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

        DLNode current = new DLNode(null, null, val);
        if (isEmpty()) {
            head = current;
        } else {
            tail.next = current;
        }
        current.prev = tail;
        tail = current;
        length++;
    }

    /**
     * Inserts a node at the beginning of the linked list.
     *
     * @param val
     */
    public void insertFirst(int val){
        DLNode current = new DLNode(null, null, val);
        if (isEmpty()) {
            tail = current;
        } else {
            head.prev = current;
        }
        current.next = head;
        head = current;
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
