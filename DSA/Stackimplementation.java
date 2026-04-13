class Stackimplementation {
    int top;
    int capacity;
    int[] stack;

    Stackimplementation(int size) {
        stack = new int[size];                                  // space complexity is O(n)
        capacity = size;
        top = -1;
    }

    public void push(int x) {                                   // O(1)
        if (top == capacity - 1) {

            int newcapacity = capacity * 5;                     // increasing the capacity
            int[] newStack = new int[newcapacity];              // creating memory for new stack

            for(int i = 0 ; i < capacity; i++){
                newStack[i] = stack[i];
            }

            stack = newStack;
            capacity = newcapacity;
        }
        stack[++top] = x;
    }

    public int pop() {                                          // O(1)
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {                                          // O(1)
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void traverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {                                   // O(1)
        return top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        Stackimplementation stack = new Stackimplementation(5);

        stack.push(55); //0 when the top is -1, it will be incremented to 0 and the value will be stored at index 0
        stack.push(65); //1
        stack.push(75); //2
        stack.push(85); //3
        stack.push(95); //4


        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());

        stack.traverse();
    }
}