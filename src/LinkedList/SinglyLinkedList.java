package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {

    /**
     * Node created for a single linked list.
     * Uses Generics <T>. This is useful because we won't have any concrete idea of Node values.
     * We will use the generics to pass in a concrete type i.e. <String> or <Integer>.
     * This helps us to store Nodes which store int, double, float, String etc.
     * Mind that our next will be a Node, no generics needed for that one.
     *
     * @param <T>
     */
    private static class Node<T> {
        T val;
        Node<T> next;

        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }

    /**
     * Adds the current node to an Arraylist.
     *
     * @param head
     * @return An Arraylist filled with all nodes in order.
     */
    public static List<String> linkedListValues(Node<String> head){
        List<String> values = new ArrayList<>();
        Node<String> current = head;

        if (head == null) {
            return values;
        }

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        return values;
    }

    /**
     * Adds nodes recursively to the Arraylist.
     *
     * @param head
     * @param values
     */
    public static void recursivelinkedListValues(Node<String> head, List<String> values){
        if (head == null) {
            return;
        }
        values.add(head.val);
        recursivelinkedListValues(head.next, values);

    }

    public static List<String> recursivelinkedListValues(Node<String> head){
        List<String> values = new ArrayList<>();
        recursivelinkedListValues(head, values);
        return values;

    }

    /**
     * Takes in the head of a linked list containing integers as an argument.
     *
     * @param head
     * @return The method returns the total sum of all values in the linked list.
     */

    public static int sumList(Node<Integer> head){
        if (head == null) {
            return 0;
        }
        int sum = 0;

        Node<Integer> current = head;
        while (current != null) {
            sum += current.val;
            current = current.next;
        }
        return sum;
    }

    /**
     * Takes in the head of a linked list containing integers as an argument.
     * Head node adds to head value, then moves to the next node and adds the next value to head.
     *
     * @param head
     * @return Total usm of all values in the linked list.
     */
    public static int recursiveSumList(Node<Integer> head){
        if (head == null) {
            return 0;
        }
        return head.val + sumList(head.next);
    }

    /**
     * Looks for a target value in my linked list.
     * Common Mistake: if we use an else statement, then we will only check one item then return false.
     * But what we want is to check all the values in the linked list.
     * Time O(n), Space O(1)
     *
     * @param head
     * @param target
     * @param <T>
     * @return True if my target value is equal to the node in the linked list.
     */
    public static <T> boolean linkedListFind(Node<T> head, T target){
        if (head == null) {
            return false;
        }
        Node<T> current = head;

        while (current != null) {
            if (current.val == target) {
                return true;
            }
            current = current.next;

        }
        return false;
    }

    /**
     * Iterates through the linked list and looks for the target using head as the compared node.val.
     * If head is empty then - false, but also if head == target then the node must be in the linked list,
     * returning true. If head was not empty and the head node was not equal to the target, then we may
     * iterate further with head.next.
     * a --> b --> null, target = b
     * head (check, head == target) FALSE a != b
     * a --> head (check, head == target) TRUE b == b
     * Time O(n), Space O(n) because we need to add all the calls to the stack.
     *
     * @param head
     * @param target
     * @param <T>
     * @return True if head.val equals target in our linked list.
     */
    public static <T> boolean recursiveLinkedListFind(Node<T> head, T target){
        if (head == null) {
            return false;
        }
        if (head.val == target) {
            return true;
        }
        return recursiveLinkedListFind(head.next, target);

    }

    /**
     * The method looks for a node at a specific index. If no values excist it should return null
     * The method uses a second pointer, besides the index pointer, to iterate through the linked List.
     * Timne  O(n), Space O(1)
     *
     * @param head
     * @param index
     * @param <T>
     * @return The value at a specific index in the linked list.
     */
    public static <T> T getNodeValue(Node<T> head, int index){
        if (head == null) {
            return null;
        }
        Node<T> current = head;
        int pointer = 0;
        while (current != null) {
            if (pointer == index) {
                return current.val;
            }
            pointer++;
            current = current.next;
        }
        return null;
    }

    /**
     * The method looks for a node at a specifix index, then returns the value on the index.
     * We can use our Integer index and decrement it with each call, so once its on 0, it should be on
     * its index. i.e. index = 2, after two calls it is on 0, which is the second index.
     * Time O(n), Space O(n)
     *
     * @param head
     * @param index
     * @param <T>
     * @return The value at a specific index recursively
     */
    public static <T> T recursiveGetNodeValue(Node<T> head, int index){
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.val;
        }

        return recursiveGetNodeValue(head.next, index - 1);
    }

    /**
     * Reverses the order of the linked list. The current.next pointer points to the prev Pointer
     * The prev should point to the current and the current to the current.next
     * null   a  -> b   ->   c -> d
     * prev  cur    nex
     * null <- a    <- b    <- c <- d
     * prev  cur     nex
     *
     * @param head
     * @param <T>
     * @return Linked list but in reversed order
     */
    public static <T> Node<T> reverseList(Node<T> head){
        // todo
        Node<T> current = head;
        Node<T> prev = null;


        while (current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;


        }
        return prev;
    }

    /**
     * Helper function to initialze the prev as null;
     *
     * @param head
     * @param <T>
     */
    public static <T> Node<T> recursiveReverseList(Node<T> head){
        return recursiveReverseList(head, null);
    }

    /**
     * Once we get to our base case, we can return the reversed linked list.
     * Top head calls helper function. head => next, prev => head - this changes up the point of view.
     *
     * @param head
     * @param prev
     * @param <T>
     * @return A reversed linked list recursively
     */
    public static <T> Node<T> recursiveReverseList(Node<T> head, Node<T> prev){
        // todo
        if (head == null) {
            return prev;
        }
        Node<T> next = head.next;
        head.next = prev;
        return recursiveReverseList(next, head);
    }
    // null <- a    <- b        c     -> null
    //        prev     head     nex
    // null <- a    <- b    <-    c     -> null
    //                           prev     head     nex

    /**
     * The method zipperLists, takes in the head of two linked lists as arguments.
     * The method should zipper the two lists together into single linked list by alternating nodes.
     * If one of the linked lists is longer than the other, the resulting list should terminate with the remaining nodes.
     * The method should return the head of the zippered linked list.
     * Do this in-place, by mutating the original Nodes.
     * You may assume that both input lists are non-empty.
     *
     * @param head1
     * @param head2
     * @param <T>
     * @return Union of both linked lists.
     */
    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2){
        Node<T> head = head1;
        Node<T> tail = head;
        Node<T> current1 = head1.next;
        Node<T> current2 = head2;
        int idx = 0;

        while (current1 != null && current2 != null) {
            if (idx % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            idx++;
            tail = tail.next;
        }

        if (current1 != null) {
            tail.next = current1;
        }
        if (current2 != null) {
            tail.next = current2;
        }
        return head;
    }


    /**
     * Helper Method, which assist the recursiveZipperlists method.
     *
     * @param head1
     * @param head2
     * @param <T>
     * @return
     */
    public static <T> Node<T> recuriseZipperLists(Node<T> head1, Node<T> head2){
        return recuriseZipperLists(head1, head2, 0);
    }

    public static <T> Node<T> recuriseZipperLists(Node<T> head1, Node<T> head2, int count){
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (count % 2 == 0) {
            head1.next = recuriseZipperLists(head1.next, head2, count + 1);
            return head1;
        } else {
            head2.next = recuriseZipperLists(head1, head2.next, count + 1);
            return head2;
        }
    }

    /**
     * The mergeList method takes in the head of two sorted linked lists as arguments. This is done by in-place mutation
     * of the original Nodes. Both input lists are non-empty and contain increasing sorted numbers.
     * Since the new list should be in increasing order,
     * we will need to compare the current value in both lists and set the smaller number first into the list, then the bigger
     * number is going to follow the smaller number into the list.
     * For this we will use a new Node dummyhead and a pointer tail to point to our dummyhead node.
     * Lastly we will need to cover cases in which one list is longer than the other one. see edge cases
     *
     * @param head1
     * @param head2
     * @return The method returns a merge of the two lists, combined into a single sorted linked list.
     * Dummyhead.next is returned since we don't want the head of the list in our solution.
     */
    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2){
        Node<Integer> dummyHead = new Node<>(0);
        Node<Integer> tail = dummyHead;

        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;

        while (current1 != null && current2 != null) {
            if (current2.val > current1.val) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;

            }
            tail = tail.next;
        }

        //edge cases
        if (current1 != null) {
            tail.next = current1;
        }
        if (current2 != null) {
            tail.next = current2;
        }
        return dummyHead.next;
    }

    /**
     * Former method but recursively. In our first comparison logic, we need to return head1.next because we used it, head2 should stay unchanged.
     * Respectively we need to implement the same logic but inverted for our else case.
     *
     * @param head1
     * @param head2
     * @return
     */
    public static Node<Integer> recursiveMergeLists(Node<Integer> head1, Node<Integer> head2){
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.val < head2.val) {
            head1.next = recursiveMergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = recursiveMergeLists(head1, head2.next);
            return head2;
        }
    }
}
