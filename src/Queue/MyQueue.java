package Queue;

import LinkedList.SinglyLinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

//FIFO
public class MyQueue {
    private Node head;
    private Node tail;
    private int size;


    private class Node {
        private int data;
        private Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public int length(){
        return size;
    }

    /**
     * if length >= 1, return true else false.
     *
     * @return
     */
    public boolean isEmpty(){
        return length() == 0;
    }

    /**
     * This method adds an element to the queue. If the queue is empty, we should just add it to the front.
     * For this we can use a temp Node.
     * temp --> [head-->] Node [<--tail]--> null
     *
     * @param data
     */
    public void enqueue(int data){
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    /**
     * The dequeue method removes the element, which was inserted first (FIFO).
     * By rearranging the references, it removes the firs-in element.
     *
     * @return
     */
    public int dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }

    /**
     * 1 ... 1 | 10 ... 2 | 11 ... 3 |
     * Converts decimal numbers to binary numbers.
     */
    public String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = queue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return result;


    }

    public void print(){
        if (isEmpty()) {
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }


}
