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
        T value;
        Node<T> next;

        public Node(T value){
            this.value = value;
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
            values.add(current.value);
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
        values.add(head.value);
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
            sum += current.value;
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
        return head.value + sumList(head.next);
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
            if (current.value == target) {
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
        if (head.value == target) {
            return true;
        }
        return recursiveLinkedListFind(head.next, target);


    }


}
