public class StudentMain {
    public static void main(String[] args) {
        Student19 student1 = new Student19();
        student1.studentID = "2441070100097";
        student1.name = "Tiara";
        student1.className = "TTI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();
        System.out.println();
    }
}
