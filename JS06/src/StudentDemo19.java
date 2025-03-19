import java.util.Scanner;
public class StudentDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int size = sc.nextInt();
        sc.nextLine();

        TopStudent19 topStudents = new TopStudent19(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Details for student No " + (i+1));
            System.out.print("Enter Student's ID/NIM: ");
            String nim = sc.nextLine();
            System.out.print("Enter Student's Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Student's Class: ");
            String studentClass = sc.nextLine();
            System.out.print("Enter Student's GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            topStudents.add(new Student19(nim, name, studentClass, gpa));
        }
        // topStudents.add(new Student19("2201", "Alice", "A", 3.9));
        // topStudents.add(new Student19("2202", "Bob", "B", 3.7));
        // topStudents.add(new Student19("2203", "Charlie", "C", 3.8));
        // topStudents.add(new Student19("2204", "David", "D", 3.6));
        // topStudents.add(new Student19("2205", "Eve", "E", 4.0));

        System.out.println("\nOriginal Student list:");
        topStudents.print();

        topStudents.insertionSort();
        // topStudents.bubbleSort();
        System.out.println("\nSorted student list (by GPA, descending): ");
        topStudents.print();

    }
}
