//Student Grade Tracker
/*Develop a program that allows a teacher to enter
students' grades and compute their average,
highest, and lowest scores. You can use arrays or
ArrayLists to store the student data.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student grades. Type -1 to stop:");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int total = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (int grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = total / (double) grades.size();

            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

        scanner.close();
    }
}
