import java.util.Scanner;

public class FinalGradeCalc {
    static double assignmentGrades = 0;
    static double quizzGrades = 0;
    static double midtermGrades = 0;
    static double finaltermGrades = 0;
    static double finalGrade = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
        result();
    }

    public static void menu(Scanner sc) {
        System.out.println("Final Grade Calculator \n=========================");
        System.out.print("Input Assignment Grade: ");
        assignmentGrades += sc.nextDouble();
        System.out.print("Input Quiz Grade: ");
        quizzGrades += sc.nextDouble();
        System.out.print("Input Mid-term exam grade: ");
        midtermGrades += sc.nextDouble();
        System.out.print("Input Final Exam Grade: ");
        finaltermGrades += sc.nextDouble();
    }

    public static void result() {
        System.out.println("========================= \n========================= ");
        if (!isValidGrade(assignmentGrades) || !isValidGrade(quizzGrades) ||
                !isValidGrade(midtermGrades) || !isValidGrade(finaltermGrades)) {
            System.out.println("Invalid Grade");
            System.out.println("=========================\n=========================");
            return;

        }
        finalGrade = (assignmentGrades * 0.2) + (quizzGrades * 0.2) + (midtermGrades * 0.3) + (finaltermGrades * 0.3);
        System.out.println("Final Grade: " + finalGrade);
        String letterGrade;
        if (finalGrade > 80) {
            letterGrade = "A";
        } else if (finalGrade > 73) {
            letterGrade = "B+";
        } else if (finalGrade > 65) {
            letterGrade = "B";
        } else if (finalGrade > 60) {
            letterGrade = "C+";
        } else if (finalGrade > 50) {
            letterGrade = "C";
        } else if (finalGrade > 30) {
            letterGrade = "D";
        } else {
            letterGrade = "E";
        }
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("=========================\n=========================");
        System.out.println("Result: " + (letterGrade.equals("D") || letterGrade.equals("E") ? "Fail" : "Pass"));
    }

    private static boolean isValidGrade(double grade) {
        return (grade >= 0 && grade <= 100);
    }

}