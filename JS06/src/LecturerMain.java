import java.util.Scanner;
public class LecturerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lecturer: ");
        int size = sc.nextInt();
        sc.nextLine();

        LecturerData lecturer = new LecturerData(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Details for Lecture No " + (i+1));
            System.out.print("Enter Lecturer's ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Lecturer's Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Lecturer's Gender (True for male False for Women): ");
            boolean genderBoolean = sc.nextBoolean();
            System.out.print("Enter Lecturer's age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturer.add(new Lecturer19(id, name, genderBoolean, age));
        }

        System.out.println("\n Original Lecturer List: ");
        lecturer.print();

        lecturer.bubbleSortASC();
        System.out.println("\n Sorted Lecturer List using Bubble Sort (Ascending by age): ");
        lecturer.print();
        
        System.out.println("\n Sorted Lecturer List using Insertion Sort (Descending by age): ");
        lecturer.insertionSortDSC();
        lecturer.print();

    }
}
