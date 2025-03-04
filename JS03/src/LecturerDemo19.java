import java.util.Scanner;

public class LecturerDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of lecturer: ");
        int n = sc.nextInt();
        Lecturer19[] lectArray = new Lecturer19[n];
        sc.nextLine();

        for (int i = 0; i < lectArray.length; i++) {
            System.out.println("Lecturer " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender (true = Male, false = Female): ");
            boolean gender = sc.nextBoolean();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lectArray[i] = new Lecturer19(id, name, gender, age);
        }
        while (true) {
            System.out.println("======================================================");
            System.out.println("Menu:");
            System.out.println("1. Show All Lecturer Data");
            System.out.println("2. Number of Lecture by Gender");
            System.out.println("3. Average Age of Lecturers Based on Gender");
            System.out.println("4. Display the Most Senior Lecturer");
            System.out.println("5. Display the Youngest Lecturer");
            System.out.println("6. Exit");
            System.out.print("Enter an available option (1-7): ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                LecturerData19.showAllLecturerData(lectArray);
                    break;
                case 2:
                LecturerData19.countLecturerByGender(lectArray);
                    break;
                case 3:
                LecturerData19.averageLectureAgeByGender(lectArray);
                    break;
                case 4:
                LecturerData19.showOldestLecturerInfo(lectArray);
                    break;
                case 5:
                LecturerData19.showYoungestLecturerInfo(lectArray);
                    break;
                case 6:
                System.out.println("Exiting the Program");
                System.out.println("======================================================");
                    return;
                default:
                System.out.println("Invalid Option");
                    break;
            }
        }

    }

}
