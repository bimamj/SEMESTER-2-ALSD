public class Student19 {
    String name;
    String nim;
    String className;
    int grade;
    public Student19(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade =-1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
