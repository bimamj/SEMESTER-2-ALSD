import java.util.Scanner;
public class PowerMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input element number: ");
       int element = sc.nextInt(); 

       Power19[] pow = new Power19[element];
       for (int i = 0; i<element; i++){
        System.out.print("Input base number for element number "+(i+1)+": ");
        int base = sc.nextInt();
        System.out.print("Input exponent for element number "+(i+1)+": ");
        int exp = sc.nextInt();
        pow[i] = new Power19(base, exp);
       }

       System.out.println("POWER RESULT USING BRUTEFORCE: ");
       for (Power19 p : pow){
        System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerBF());}
       System.out.println("POWER RESULT USING DIVIDE AND CONQUER: ");
       for (Power19 p : pow){
        System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerDC(p.baseNumber, p.exponent));
       }
    }
}
