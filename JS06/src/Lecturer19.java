public class Lecturer19 {
    String id;
    String name;
    boolean genderBoolean;
    int age;

    public Lecturer19(String id, String name, boolean genderBoolean, int age) {
        this.id = id;
        this.name = name;
        this.genderBoolean = genderBoolean;
        this.age = age;
    }
    public void print() {
        String gender = (genderBoolean == true) ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age);
    }
}
