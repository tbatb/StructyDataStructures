package Queue;

import java.util.Queue;

public class Test {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.print();
        System.out.println("===================================================");
        queue.dequeue();
        queue.print();

    }
}
