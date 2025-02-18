import java.util.Scanner;
public class ipCalculator {
    static String[] courseName = {"Pancasila","Concept of Information Technology","Critical Thinking and Problem Solving", "Fundamental Mathematic","Software Engineering","Basic Programming","Basic Programmning Lab","Health and Occupational Safety"};
    static String[] letterGrade = new String[8];
    static double[] courseCreditValue = {2,2,2,3,2,2,3,2};
    static double[] studentGrade = new double[8];
    static double[] numGrade = new double [8];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalGrade = 0;
        System.out.println("=================================");
        System.out.println("Semester GPA Calculating Program");
        System.out.println("=================================");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("Enter Grade for Course %s: ",courseName[i]);
            studentGrade[i] = sc.nextDouble();
            if (studentGrade[i] > 100 && studentGrade[i] < 0) {
                System.out.println("Invalid Grade");
                return;
            }

            if (studentGrade[i] > 80) {
                letterGrade[i] = "A";
            } else if (studentGrade[i] > 73) {
                letterGrade[i] = "B+";
            } else if (studentGrade[i] > 65) {
                letterGrade[i] = "B";
            } else if (studentGrade[i] > 60) {
                letterGrade[i] = "C+";
            } else if (studentGrade[i] > 50) {
                letterGrade[i] = "C";
            } else if (studentGrade[i] > 30) {
                letterGrade[i] = "D";
            } else {
                letterGrade[i] = "E";
            }

            switch (letterGrade[i]) {
                case "A":
                    numGrade[i] = 4;
                    break;
                case "B+":
                    numGrade[i] = 3.5;
                    break;
                case "B":
                    numGrade[i] = 3;
                    break;
                case "C+":
                    numGrade[i] = 2.5;
                    break;
                case "C":
                    numGrade[i] = 2;
                    break;
                case "D":
                    numGrade[i] = 1;
                    break;
                default:
                    numGrade[i] = 0;
                    break;
            }
            totalGrade += (numGrade[i]*courseCreditValue[i]);
            sc.close();
            
        }
        sc.nextLine();
        System.out.println("=====================================================================================");
        System.out.println("Conversion Result: ");
        System.out.println("=====================================================================================");
        System.out.printf("%-40s %-20s %-20s %-5s \n", "Course Name", "Numerical Grade", "Letter Grade", "Value");
    
        for (int i = 0; i<courseName.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20s \n", courseName[i], studentGrade[i], letterGrade[i], numGrade[i]);
        }
        System.out.println("=====================================================================================");
        System.out.printf("GPA: %.2f", totalGrade/18);
        sc.close();
        }
        


    }
