package Stack;

public class DiStack {
    // push: add data
    // pop: delete the last in element in the array
    // peek: read the last inserted element in the array
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data){
        if (size() == capacity) {
            expand();
        }
        stack[top] = data;
        top++;


    }

    private void expand(){
        //get current length
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        /*
        for (int i = 0; i < length; i++){
            newStack[i] = stack[top % length];
        }

         */
        stack = newStack;
        capacity *= 2;
    }

    public int pop(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            // fetching get the top element in the array
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;

    }

    private void shrink(){
        int length = size();
        if (length <= (capacity / 2) / 2)
            capacity = capacity / 2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }

    public void show(){
        for (int n : stack) {
            System.out.println(n + " ");
        }
    }

    public int peek(){
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top <= 0;
    }

}
