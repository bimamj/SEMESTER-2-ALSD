public class CourseMain {
    public static void main(String[] args) {
        Course19 course1 = new Course19();
        course1.courseID = "MA1";
        course1.name = "Math 1";
        course1.credit = 2;
        course1.hour = 6;
        course1.print();
        course1.changeCredit(3);
        course1.reduceHour(6);
        course1.print();
        System.out.println("\n");

        Course19 course2 = new Course19("DTS", "Data Structure", 3, 6);
        course2.print();
        course2.addHour(2);
        course2.print();

    }

}
