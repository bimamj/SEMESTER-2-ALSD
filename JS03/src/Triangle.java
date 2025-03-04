import java.lang.Math;
public class Triangle {
    public int base;
    public int height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }
    public double countArea() {
        return 0.5*base*height;
    }
    //Assume that the triangle is always right angled, since only the base and height is known
    public double countPerimeter () {
        double hypotenuse = Math.sqrt(Math.pow(base, 2)-Math.pow(height, 2));
        return base+height+hypotenuse;
    }
}
