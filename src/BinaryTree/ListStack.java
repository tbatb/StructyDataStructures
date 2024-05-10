package BinaryTree;


public class ListStack {
    public ListNode head;

    public void push(String v){
        head = new ListNode(v, head);
    }

    public String pop(){
        if (head != null) {
            String result = head.getValue();
            head = head.getNext();
            return result;
        }
        return null;
    }

    public String peek(){
        return head == null ? null : head.getValue();
    }

    public boolean isEmpty(){
        if (head == null) {
            return true;
        } else
            return false;
    }


    public class ListNode {
        private String value;
        private ListNode next;

        public ListNode(String v, ListNode n){
            value = v;
            next = n;
        }

        public String getValue(){
            return value;
        }

        public void setValue(String value){
            this.value = value;
        }

        public ListNode getNext(){
            return next;
        }

        public void setNext(ListNode next){
            this.next = next;
        }


    }
}
