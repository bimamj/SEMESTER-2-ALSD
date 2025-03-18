public class StudentMain {
    public static void main(String[] args) {
        Student19[] arr = new Student19[8];
        arr[0] = new Student19("Ahmad", "220101001", 2022, 78, 82);
        arr[1] = new Student19("Budi", "220101002", 2022, 85, 88);
        arr[2] = new Student19("Cindy", "220101003", 2021, 90, 87);
        arr[3] = new Student19("Dian", "220101004", 2021, 76, 79);
        arr[4] = new Student19("Eko", "220101005", 2023, 92, 95);
        arr[5] = new Student19("Fajar", "220101006", 2020, 88, 85);
        arr[6] = new Student19("Gina", "220101007", 2023, 80, 83);
        arr[7] = new Student19("Hadi", "220101008", 2020, 82, 84);

        Student19 topMidterm = Student19.highMidtermDC(arr, 0, arr.length-1);
        Student19 lowMidterm = Student19.lowMidtermDC(arr, 0, arr.length-1);
        double aveFinalterm = Student19.averageFinalscBF(arr);
        
        System.out.println("=================================================================");
        System.out.printf("| %-10s | %-10s | %-15s | %-15s |\n", "Name", "ID", "Midterm Score", "Final Score");
        System.out.println("=================================================================");
        
        for (Student19 student : arr) {
            System.out.printf("| %-10s | %-10s | %-15.2f | %-15.2f |\n", student.name, student.id, student.midtermsc, student.finalsc);
        }
        System.out.println("=================================================================");

        System.out.println("Student with the highest Midterm score is " + topMidterm.name + " with a score of " + topMidterm.midtermsc);
        System.out.println("Student with the lowest Midterm score is " + lowMidterm.name + " with a score of " + lowMidterm.midtermsc);
        System.out.printf("The average Finalterm score of all students is: %.2f", aveFinalterm);



    }
    
}
