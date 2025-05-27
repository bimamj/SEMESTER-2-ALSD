public class DoubleLinkedLists {
    Node head;
    Node tail;
    int size = 0;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void add(int index, Student data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }
    }

    void insertAfter(String key, Student data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                Node newNode = new Node(data);
                if (temp == tail) {
                    temp.next = newNode;
                    newNode.prev = temp;
                    tail = newNode;
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                size++;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Insertion failed. Data (" + key + ") not found!!");
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next != null) {
                    if (temp.next == tail) {
                        removeLast();
                    } else {
                        Node toRemove = temp.next;
                        temp.next = toRemove.next;
                        toRemove.next.prev = temp;
                        size--;
                    }
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Remove failed. Data (" + key + ") not found!!");
    }

     Student getFirst() {
        return isEmpty() ? null : head.data;
    }

    Student getLast() {
        return isEmpty() ? null : tail.data;
    }

    Student getIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        return size;
    }

    int indexOf(String nim) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }

        int size = 0;
        Node tempCount = head;
        while (tempCount != null) {
            size++;
            tempCount = tempCount.next;
        }

        if (index < 0 || index >= size) {
            System.out.println("Invalid index: " + index);
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // void remove(int index) {
    // if (isEmpty()) {
    // System.out.println("Double linked list is currently empty!!");
    // } else if (index == 0) {
    // removeFirst();
    // } else {
    // Node temp = head;
    // for (int i = 0; i < index; i++) {
    // temp = temp.next;
    // }
    // if (temp == tail) {
    // removeLast();
    // } else {
    // temp.prev.next = temp.next;
    // temp.next.prev = temp.prev;
    // }
    // }
    // }

}
