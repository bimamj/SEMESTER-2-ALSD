import java.util.Scanner;
public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = sc.nextInt();

        Sum19 sum = new Sum19(element);
        for (int i = 0; i < element; i++){
            System.out.print("Input profit #"+(i+1)+": ");
            sum.profits[i] = sc.nextDouble();
        }

        System.out.println("Total Profit using BF: "+sum.totalBF());
        System.out.println("Total Profit using DC: "+sum.totalDC(sum.profits,0, element-1));
    }
    
}
