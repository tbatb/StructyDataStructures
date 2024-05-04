package LinkedList;


public class LinkedList {

    public static void main(String[] args){
        run();
    }

    public LinkedList(){
        Node node = new Node(5);

    }

    public static void run(){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.next = b;
        b.next = c;

        Node<Integer> node1 = new Node<>(42);

        System.out.println(a.next.value);
        System.out.println(node1.value);
    }


    private static class Node<T> {
        T value;
        Node next;

        private Node(T value){
            this.value = value;
            this.next = null;
        }
    }
}