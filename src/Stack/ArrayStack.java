package Stack;

public class ArrayStack {

    // push: add data
    // pop: delete the last in element in the array
    // peek: read the last inserted element in the array
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        if (top == 4) {
            System.out.println("Out of bound");
        } else {
            stack[top] = data;
            top++;
        }

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
        }
        return data;
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
