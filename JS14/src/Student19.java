public class Student19 {
    String nim, name, className;
    double ipk;

    public Student19() {
    }

    public Student19(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}
