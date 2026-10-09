import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;

        double percentage = total / 5.0;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        }
        else if (percentage >= 80) {
            grade = 'B';
        }
        else if (percentage >= 70) {
            grade = 'C';
        }
        else if (percentage >= 60) {
            grade = 'D';
        }
        else if (percentage >= 50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }

        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}