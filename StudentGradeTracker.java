import java.util.Scanner;
public class StudentGradeTracker { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== STUDENT GRADE TRACKER =====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        double[] marks = new double[n];
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        System.out.println("\n===== STUDENT REPORT =====");
        double sum = 0;
        double highest = marks[0];
        double lowest = marks[0];
        for (int i = 0; i < n; i++) {
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            String grade;
            if (marks[i] >= 90) {
                grade = "A";
            } else if (marks[i] >= 75) {
                grade = "B";
            } else if (marks[i] >= 60) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.println(
                    "Name: " + names[i] +
                    " | Marks: " + marks[i] +
                    " | Grade: " + grade);
        }
        double average = sum / n;
        System.out.println("\n===== SUMMARY =====");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}
