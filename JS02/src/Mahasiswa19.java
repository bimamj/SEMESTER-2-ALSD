public class Mahasiswa19 {
    String studentID;
    String name;
    String className;
    double gpa;

    void print() {
        System.out.println("Student ID  : " + studentID);
        System.out.println("Name        : " + name);
        System.out.println("Class       : " + className);
        System.out.println("GPA         : " + gpa);
    }

    void changeClass(String newClass) {
        className = newClass;
    }

    void updateGPA(double newGPA) {
        if (gpa > 0.0 || gpa < 4.0) {
            gpa = newGPA;
        } else {
            System.out.println("Invalid GPA. Must be between 0.0 and 4.0");

        }
    }

    String evaluate() {

        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.0) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
