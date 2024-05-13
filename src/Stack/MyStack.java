package Stack;

public class MyStack<T> {
    // push, peek, pop, size, isEmpty
    private int array[];
    private int top; // pointer
    private int capacity;

    public MyStack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    /**
     * pushes an element to the top of the stack.
     * Increment the top and the array of the top should be the item.
     *
     * @param item
     */
    public void push(int item){
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }

    /**
     * Get the item from the array.
     *
     * @return the top of the stack
     */
    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    /**
     * modifies the stack and removes the last in element of the stack.
     *
     * @return new stack without the top element.
     */
    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

}
