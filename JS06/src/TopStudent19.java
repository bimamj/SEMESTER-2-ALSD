public class TopStudent19 {
    Student19[] listStudents;
    int idx;

    public TopStudent19(int size) {
        idx = 0;
        listStudents = new Student19[size];
    }

    public void add(Student19 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j <idx -i -1; j++) {
                if (listStudents[j].gpa < listStudents[j +1].gpa) {
                    Student19 temp = listStudents[j];
                    listStudents[j] = listStudents[j+1];
                    listStudents[j+1] = temp;
                }
            }
        }
    }
}
