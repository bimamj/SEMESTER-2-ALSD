public class Course19 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course19() {

    }

    public Course19(String id, String name, int credit, int hour) {
        courseID = id;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print() {
        System.out.println("Course ID   : " + courseID);
        System.out.println("Name        : " + name);
        System.out.println("Credit      : " + credit);
        System.out.println("Hour        : " + hour);
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("Change credit to: " + credit);
    }

    void addHour(int hourAddition) {
        hour += hourAddition;
    }

    void reduceHour(int hourReduction) {
        if (hour > hourReduction) {
            hour -= hourReduction;
        } else {
            System.out.println("Hour Reduction is bigger than current hour. Cannot go to negative Hour");
        }
    }

}