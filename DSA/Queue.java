class Queue {
    int front, rear, capacity;
    int[] queue;

    Queue(int x) {
        front = rear = 0;
        capacity = x;
        queue = new int[x];
    }

    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = item;
        rear++;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        int item = queue[front];


        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        rear--;
        return item;
    }

    public int front() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}

class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q.dequeue());
        System.out.println("Front item is: " + q.front());
    }
}