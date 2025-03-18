
public class Student19 {
    String name, id;
    int year;
    double midtermsc, finalsc;
    Student19(String name, String id, int year, int midtermsc, int finalsc ){
        this.name = name;
        this.id = id;
        this.year = year;
        this.midtermsc = midtermsc;
        this.finalsc = finalsc;
    }
    public static Student19 highMidtermDC(Student19[] arr, int left, int right){
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right)/2;
        Student19 leftSum = highMidtermDC(arr, left, mid);
        Student19 rightSum = highMidtermDC(arr, mid+1, right);
        return (leftSum.midtermsc > rightSum.midtermsc) ? leftSum : rightSum;
        
    }
    public static Student19 lowMidtermDC(Student19[] arr, int left, int right){
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right)/2;
        Student19 leftSum = lowMidtermDC(arr, left, mid);
        Student19 rightSum = lowMidtermDC(arr, mid+1, right);
        return (leftSum.midtermsc < rightSum.midtermsc) ? leftSum : rightSum;
        
    }

    public static double averageFinalscBF(Student19[] arr){
        double total = 0;
        for (Student19 student : arr) {
            total += student.finalsc;
        }
        return total / arr.length;
    }
    
}