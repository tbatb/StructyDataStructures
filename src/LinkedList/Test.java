package LinkedList;

public class Test {
    public static void main(String[] args){
        System.out.println("longest Streak: ");
        SinglyLinkedList.Node<Integer> a = new SinglyLinkedList.Node<>(3);
        SinglyLinkedList.Node<Integer> b = new SinglyLinkedList.Node<>(3);
        SinglyLinkedList.Node<Integer> c = new SinglyLinkedList.Node<>(3);
        SinglyLinkedList.Node<Integer> d = new SinglyLinkedList.Node<>(3);
        SinglyLinkedList.Node<Integer> e = new SinglyLinkedList.Node<>(9);
        SinglyLinkedList.Node<Integer> f = new SinglyLinkedList.Node<>(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 3 -> 3 -> 3 -> 3 -> 9 -> 9

        System.out.println(SinglyLinkedList.longestStreak(a)); // 4

        SinglyLinkedList.Node<String> x = new SinglyLinkedList.Node<>("a");
        SinglyLinkedList.Node<String> y = new SinglyLinkedList.Node<>("b");
        SinglyLinkedList.Node<String> z = new SinglyLinkedList.Node<>("c");
        SinglyLinkedList.Node<String> u = new SinglyLinkedList.Node<>("d");
        SinglyLinkedList.Node<String> v = new SinglyLinkedList.Node<>("e");
        SinglyLinkedList.Node<String> w = new SinglyLinkedList.Node<>("f");

        x.next = y;
        y.next = z;
        z.next = u;
        u.next = v;
        v.next = w;

        // a -> b -> c -> d -> e -> f

        System.out.println(SinglyLinkedList.removeNode(x, "z")); // 4


    }
}
