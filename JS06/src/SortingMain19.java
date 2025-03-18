public class SortingMain19 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting19 sorting = new Sorting19(a);
        Sorting19 sorting2 = new Sorting19(b);
        Sorting19 sorting3 = new Sorting19(c);

        System.out.println("Original array: ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort): ");
        sorting.print();
        System.out.println(" ");

        System.out.println("Original array: ");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort): ");
        sorting2.print();
        System.out.println(" ");

        System.out.println("Original Array: ");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();


    }
    
}
