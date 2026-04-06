class Stack {
    int top;
    int capacity;
    int[] stack;

    Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) { // O(1)
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {  // O(1)
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() { // O(1)
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {  // O(1)
        return top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(55); //0 when the top is -1, it will be incremented to 0 and the value will be stored at index 0
        stack.push(65); //1
        stack.push(75); //2
        stack.push(85); //3
        stack.push(95); //4

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
    }
}