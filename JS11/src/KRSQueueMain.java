import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);
        int choice;

        while (true) {
            System.out.println("\n=== DPA KRS Approval Queue ===");
            System.out.println("1. Register student (enqueue)");
            System.out.println("2. Approve KRS for 2 students (dequeue)");
            System.out.println("3. Show all students in queue");
            System.out.println("4. Show first two students");
            System.out.println("5. Show last student in queue");
            System.out.println("6. Show queue stats");
            System.out.println("7. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Program: ");
                    String prog = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();
                    Student19 s = new Student19(nim, name, prog, cls);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeueTwo();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    queue.peekTwo();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    queue.printStats();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
         } 
    }
}
