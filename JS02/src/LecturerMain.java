public class LecturerMain {
    public static void main(String[] args) {
        Lecturer19 lecture1 = new Lecturer19();
        lecture1.lecturerID = "GEO";
        lecture1.name = "George";
        lecture1.status = true;
        lecture1.startYear = 2007;
        lecture1.expertiseField = "Artificial Intelligence";
        lecture1.print();
        lecture1.calculateTenure(2025);
        lecture1.changeExpertiseField("Data Mining");
        lecture1.print();
        System.out.println("\n");
        Lecturer19 lecturer2 = new Lecturer19("ELZ","Elizabeth", false, 1991, "Robotic");
        lecturer2.print();
        lecturer2.calculateTenure(2025);
        lecturer2.setStatus(true);
        lecturer2.changeExpertiseField("Cybersecurity");
        lecturer2.print();
    }

}
