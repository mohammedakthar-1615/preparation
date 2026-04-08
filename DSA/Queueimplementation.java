class Queueimplementation {
    int front, rear, capacity;
    int[] queue;

    Queueimplementation(int x) {
        front = rear = 0;
        capacity = x;
        queue = new int[x];                                 // space complexity is O(n)
    }

        public void enqueue(int item) {
            if (rear == capacity) {

                int newCapacity = capacity * 2;             // (increasing the capacity)
                int[] newQueue = new int[newCapacity];      //  (creating memory for new queue)

                
                for (int i = 0; i < rear; i++) {            // copy old elements
                    newQueue[i] = queue[i];
                }


                queue = newQueue;
                capacity = newCapacity;
            }

            queue[rear] = item;
            rear++;
        }

    public int dequeue() {                                  // O(n)
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

    public int front() {                                    // O(1)
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}

class QueueMain {
    public static void main(String[] args) {
        Queueimplementation q = new Queueimplementation(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 

        System.out.println(q.dequeue());
        System.out.println("Front item is: " + q.front());
    }
}