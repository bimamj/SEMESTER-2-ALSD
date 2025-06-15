public class BinaryTreeArray19 {
    Student19[] data;
    int idxLast;

    public BinaryTreeArray19() {
        data = new Student19[10];
        idxLast = -1;
    }

    void populateData(Student19[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Student19 data) {
        if (idxLast < this.data.length - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree array is full.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

}