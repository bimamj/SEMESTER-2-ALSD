
import java.util.Scanner;

public class MainLinkQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedQueue queue = new LinkedQueue();
        int choice;

        while (true) {

            System.out.println("\n=== Student Service Queue Menu ===");
            System.out.println("1. Add Student to Queue");
            System.out.println("2. Call Next Student");
            System.out.println("3. View Front Student");
            System.out.println("4. View Rear Student");
            System.out.println("5. View All Students in Queue");
            System.out.println("6. Total Students in Queue");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();
                    Student19 s = new Student19(nim, name, cls);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.viewFront();
                    break;
                case 4:
                    queue.viewRear();
                    break;
                case 5:
                    queue.viewAll();
                    break;
                case 6:
                    queue.queueSize();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
