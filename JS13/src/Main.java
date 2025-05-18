import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        int choice;

        // while (true) {
        //     System.out.println("\n=== LinkedList Menu ===");
        //     System.out.println("1. Add Student to Front");
        //     System.out.println("2. Add Student to End");
        //     System.out.println("3. Insert Student at Index");
        //     System.out.println("4. Insert Student After a Name");
        //     System.out.println("5. Display All");
        //     System.out.println("0. Exit");
        //     System.out.print("Choose: ");
        //     choice = sc.nextInt();
        //     sc.nextLine();

        //     switch (choice) {
        //         case 1:
        //             System.out.print("NIM: ");
        //             String nim1 = sc.nextLine();
        //             System.out.print("Name: ");
        //             String name1 = sc.nextLine();
        //             System.out.print("Class: ");
        //             String className1 = sc.nextLine();
        //             System.out.print("GPA: ");
        //             double gpa1 = sc.nextDouble();

        //             Student s1 = new Student(nim1, name1, className1, gpa1);
        //             sll.addFirst(s1);
        //             break;

        //         case 2:
        //             System.out.print("NIM: ");
        //             String nim2 = sc.nextLine();
        //             System.out.print("Name: ");
        //             String name2 = sc.nextLine();
        //             System.out.print("Class: ");
        //             String className2 = sc.nextLine();
        //             System.out.print("GPA: ");
        //             double gpa2 = sc.nextDouble();
        //             Student s2 = new Student(nim2, name2, className2, gpa2);
        //             sll.addLast(s2);
        //             break;

        //         case 3:
        //             System.out.print("Insert at index: ");
        //             int index = sc.nextInt();
        //             sc.nextLine();
        //             System.out.print("NIM: ");
        //             String nim3 = sc.nextLine();
        //             System.out.print("Name: ");
        //             String name3 = sc.nextLine();
        //             System.out.print("Class: ");
        //             String className3 = sc.nextLine();
        //             System.out.print("GPA: ");
        //             double gpa3 = sc.nextDouble();
        //             Student s3 = new Student(nim3, name3, className3, gpa3);
        //             sll.insertAt(index, s3);
        //             break;

        //         case 4:
        //             System.out.print("Insert after name: ");
        //             String key = sc.nextLine();
        //             System.out.print("NIM: ");
        //             String nim4 = sc.nextLine();
        //             System.out.print("Name: ");
        //             String name4 = sc.nextLine();
        //             System.out.print("Class: ");
        //             String className4 = sc.nextLine();
        //             System.out.print("GPA: ");
        //             double gpa4 = sc.nextDouble();
        //             Student s4 = new Student(nim4, name4, className4, gpa4);
        //             sll.insertAfter(s4, key);
        //             break;

        //         case 5:
        //             sll.print();
        //             break;

        //         case 0:
        //             System.out.println("Exiting Program!");
        //             return;

        //         default:
        //             System.out.println("Invalid option!");
        //     }

        // }
        Student std1 = new Student("001", "Student 1", "TI-1I", 3.89);
        Student std2 = new Student("002", "Student 2", "TI-1I", 3.45);
        Student std3 = new Student("003", "Student 3", "TI-1I", 3.20);
        Student std4 = new Student("004", "Student 4", "TI-1I", 3.00);
        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();
        System.out.println("Data at index 1 is:");
        Student data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
