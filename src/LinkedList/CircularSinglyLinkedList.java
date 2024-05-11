package LinkedList;

public class CircularSinglyLinkedList {
    /*
    Similar to the singly linked list, traversal to only one direction is possible but with a slight difference. The last node, in other words
    the tail, points to the first node in the linked list.
             |first| --> |node1| --> |node2| --> |tail| --> |first|
     */
    private CLLNode last;
    private int length;

    public CircularSinglyLinkedList(CLLNode last, int length){
        this.last = last;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void createCircularLinkedList(){
        CLLNode first = new CLLNode(null, 1);
        CLLNode second = new CLLNode(null, 2);
        CLLNode third = new CLLNode(null, 3);
        CLLNode fourth = new CLLNode(null, 4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        last = fourth;

    }

    /**
     * Circular singly linked list Node class which is made out of the Node next and the key data.
     */
    class CLLNode {
        private CLLNode next;
        private int data;

        public CLLNode(CLLNode n, int d){
            this.next = n;
            this.data = d;
        }
    }
}
