import java.util.Scanner;
public class nimLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;
            System.out.print((i % 2 == 1 ? "*" : i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
