public class Lecturer19 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer19() {

    }
    
    public Lecturer19(String id, String name, boolean status, int startingYear, String field ) {
        lecturerID = id;
        this.name = name;
        this.status = status;
        startYear = startingYear;
        expertiseField = field;
    }

    void print() {
        System.out.println("Lecturer ID     : " + lecturerID);
        System.out.println("Name            : " + name);
        String isActive = (status == true) ? "Active" : "Inactive";
        System.out.println("Status          : " + isActive);
        System.out.println("StartYear       : " + startYear);
        System.out.println("Field Expertise : " + expertiseField);

    }

    void setStatus(boolean newStatus){
        status = newStatus;
        System.out.println("Status Updated");
    }

    int calculateTenure(int yearNow) {
        int tenure = yearNow-startYear;
        System.out.println("Years of service: " + tenure);
        return tenure;
    }

    void changeExpertiseField(String newField) {
        System.out.println("Change expertise from " + expertiseField + " to " + newField);
        expertiseField = newField;

    }
}

