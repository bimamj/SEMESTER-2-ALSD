public class LecturerData {
    Lecturer19[] listLecturer;
    int idx =0;

    public LecturerData(int size) {
        idx = 0;
        listLecturer = new Lecturer19[size];
    }

    public void add(Lecturer19 lecturer) {
        if (idx < listLecturer.length) {
            listLecturer[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void bubbleSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listLecturer[j].age > listLecturer[j + 1].age) {
                    Lecturer19 temp = listLecturer[j];
                    listLecturer[j] = listLecturer[j + 1];
                    listLecturer[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSortDSC() {
        for (int i = 1; i < idx; i++){ 
            Lecturer19 temp = listLecturer[i];
            int j = i;
        

        while (j > 0 && listLecturer[j-1].age < temp.age) {
            listLecturer[j] = listLecturer[j-1];
            j--;
        }
        listLecturer[j] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listLecturer[i].print();
        }
    }


}
