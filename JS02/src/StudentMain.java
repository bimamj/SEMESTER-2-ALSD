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

        Student19 student2 = new Student19("244107020040","Rizky", "TI-1I", 3.5);
            student2.updateGPA(3.3);
            student2.print();
        
        Student19 student3 = new Student19("244107020123", "Bima J", "TI-1I", 3.7);
            student3.print();
    }
}
