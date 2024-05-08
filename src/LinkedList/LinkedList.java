package LinkedList;


public class LinkedList {

    public static void main(String[] args){
        run();
    }

    public LinkedList(){
        Node node = new Node(5);

    }

    public static void printList(Node head){
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void recursivePrintList(Node head){
        if (head == null) {
            return;
        }
        System.out.println(head.value);
        recursivePrintList(head.next);
    }

    public static void run(){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.next = b;
        b.next = c;

        Node<Integer> node1 = new Node<>(42);

        // a -> b       -> c     -> null
        // cur  cur.n
        System.out.println(a.next.value);
        System.out.println(node1.value);
        System.out.println("printList and recursion: ");
        printList(a);
        recursivePrintList(a);

    }


    /**
     * Node created for a single linked list.
     * Uses Generics <T>. This is useful because we wont have any concrete idea of Node values.
     * We will use the generics to pass in a concrete type i.e <String> or <Integer>.
     * This helps us to store Nodes which store int, double, float, String etc.
     * Mind that our next will be a Node, no generics needed for that one.
     *
     * @param <T>
     */
    private static class Node<T> {
        T value;
        Node next;

        private Node(T value){
            this.value = value;
            this.next = null;
        }
    }
}