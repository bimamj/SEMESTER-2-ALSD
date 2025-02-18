import java.util.Scanner;
public class royalGarden {
    static int[][] royalBranch = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9},
    
    };
    static int[] flowerPrices = {75000, 50000, 60000, 10000};
    static int[] stockReduction = {-1, -2, -0, -5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        branchIncome();
        System.out.println();
        System.out.print("Do you want to see current stock? Y/N: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.print("Choose from existing Branch (1-4): ");
            int choose = sc.nextInt();
            stockAfterReduction(choose-1);
            sc.close();
        } else {
            System.out.println("Exiting program");
            sc.close();
            return;
        }
        
    }
    public static void branchIncome() {
        for (int i = 0; i < royalBranch.length; i++) {
            int income = 0;
            for (int j = 0; j < royalBranch[i].length; j++) {
                income += royalBranch[i][j] * flowerPrices[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + income);
        }
    }
    public static void stockAfterReduction(int branchIndex) {
        if (branchIndex < 0 || branchIndex >= royalBranch.length) {
            System.out.println("Invalid branch index.");
            return;
        }
        
        int[] updatedStock = new int[4];
        for (int i = 0; i < royalBranch[branchIndex].length; i++) {
            updatedStock[i] = royalBranch[branchIndex][i] + stockReduction[i];
            if (updatedStock[i] < 0) updatedStock[i] = 0;
        }
        
        System.out.println("Aglonema: " + updatedStock[0]);
        System.out.println("Keladi: " + updatedStock[1]);
        System.out.println("Alocasia: " + updatedStock[2]);
        System.out.println("Mawar: " + updatedStock[3]);
    }
}
