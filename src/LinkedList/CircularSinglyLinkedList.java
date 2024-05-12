package LinkedList;

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
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
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

        System.out.println("" + first.data);

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
