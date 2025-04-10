import java.util.Scanner;
public class LecturerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lecturers: ");
        int size = sc.nextInt();
        sc.nextLine();

        LecturerData lecturer = new LecturerData(size);

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter Details for Lecturer No " + (i + 1));
            System.out.print("Enter Lecturer's ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Lecturer's Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Lecturer's Gender (true = Male, false = Female): ");
            boolean genderBoolean = sc.nextBoolean();
            System.out.print("Enter Lecturer's Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturer.add(new Lecturer19(id, name, genderBoolean, age));
        }

        System.out.println("\nOriginal Lecturer List:");
        lecturer.print();

        //sort ascending age
        lecturer.bubbleSortASC();
        System.out.println("\nSorted Lecturer List using Bubble Sort (Ascending by age):");
        lecturer.print();

        //sort descending age
        lecturer.insertionSortDSC();
        System.out.println("\nSorted Lecturer List using Insertion Sort (Descending by age):");
        lecturer.print();

        //sequential search by name
        System.out.print("\nEnter Lecturer's Name to search (Sequential Search): ");
        String searchName = sc.nextLine();
        int nameIndex = lecturer.findSequentialSearch(searchName);
        if (nameIndex != -1) {
            System.out.println("Lecturer found at index " + nameIndex + ":");
            lecturer.listLecturer[nameIndex].print();
        } else {
            System.out.println("Lecturer not found.");
        }

        //binary search by age
        lecturer.bubbleSortASC();
        System.out.print("\nEnter Lecturer's Age to search (Binary Search): ");
        int searchAge = sc.nextInt();
        int ageIndex = lecturer.findBinarySearch(searchAge, 0, size - 1);
        if (ageIndex != -1) {
            System.out.println("Lecturer found at index " + ageIndex + ":");
            lecturer.listLecturer[ageIndex].print();
        } else {
            System.out.println("Lecturer with that age not found.");
        }
    }
}
