public class LinkedQueue {
    Node19 front, rear;
    int size = 0;
    final int MAX_SIZE = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size >= MAX_SIZE;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student19 s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        Node19 newNode = new Node19(s);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Student added to queue.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Calling student:");
        front.data.print();
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    void viewFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front of queue:");
            front.data.print();
        }
    }

    void viewRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Rear of queue:");
            rear.data.print();
        }
    }

    void viewAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            Node19 current = front;
            System.out.println("All students in queue:");
            while (current != null) {
                current.data.print();
                current = current.next;
            }
        }
    }

    void queueSize() {
        System.out.println("Total students in queue: " + size);
    }
}
