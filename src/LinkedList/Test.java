package LinkedList;

import java.util.List;

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


        SinglyLinkedList.createLinkedList(List.of("h", "e", "y"));// h -> e -> y
        SinglyLinkedList.createLinkedList(List.of(1, 7, 1, 8)); // 1 -> 7 -> 1 -> 8
        SinglyLinkedList.createLinkedList(List.of("a"));// a
        SinglyLinkedList.createLinkedList(List.of());// null


        System.out.println("===================================================");
        DoublyLinkedList dll = new DoublyLinkedList(null, null, 0);
        dll.insertLast(1);
        dll.insertLast(4);
        dll.insertLast(6);
        dll.insertLast(8);
        dll.displayForward();
        System.out.println();
        dll.displayBackward();

        System.out.println("===================================================");
        DoublyLinkedList nodelist = new DoublyLinkedList(null, null, 0);
        nodelist.insertFirst(1);
        nodelist.insertFirst(3);
        nodelist.insertFirst(5);
        nodelist.insertFirst(11);
        nodelist.insertFirst(23);
        nodelist.displayForward();
        System.out.println();
        nodelist.displayBackward();


        System.out.println("===================================================");
        nodelist.insertAtEnd(99);
        nodelist.displayForward();
        nodelist.deleteFirstNode();
        nodelist.deleteFirstNode();
        System.out.println();
        nodelist.displayForward();
        System.out.println();
        nodelist.deleteLastNode();
        nodelist.displayForward();
        System.out.println();
        nodelist.deleteLastNode();

        System.out.println("===================================================");
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.display();

        System.out.println("===================================================");
        cll.display();
        cll.insertAtFront(99);
        cll.insertAtFront(101);
        cll.display();

    }


}
