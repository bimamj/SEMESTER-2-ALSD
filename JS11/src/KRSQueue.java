public class KRSQueue {
    Student19[] data;
    int front = 0, rear = -1, size = 0, max;
    int approvedCount = 0;

    public KRSQueue(int max) {
        this.max = max;
        data = new Student19[max];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student19 s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = s;
        size++;
        System.out.println(s.name + " has been added to the queue.");
    }

    void dequeueTwo() {
        if (size < 2) {
            System.out.println("Not enough students in queue to approve (need 2).");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Student19 s = data[front];
            System.out.println("Approving KRS for:");
            s.print();
            front = (front + 1) % max;
            size--;
            approvedCount++;
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        System.out.println("Students in queue:");
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void peekTwo() {
        if (size < 2) {
            System.out.println("Less than two students in the queue.");
            return;
        }
        System.out.println("First two students in line:");
        data[front].print();
        data[(front + 1) % max].print();
    }

    void viewRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Last student in the queue:");
            data[rear].print();
        }
    }

    void printStats() {
        System.out.println("Current queue size: " + size);
        System.out.println("Approved students: " + approvedCount);
        System.out.println("Remaining students: " + (30 - approvedCount));
    }
}

