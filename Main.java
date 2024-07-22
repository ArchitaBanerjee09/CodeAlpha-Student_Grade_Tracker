package com.tracker;

import com.tracker.model.GradeTracker;
import com.tracker.util.InputUtil;
import com.tracker.model.Student;

public class Main {
    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();
        InputUtil inputUtil = new InputUtil();

        System.out.println("Welcome to the Student Grade Tracker!");

        while (true) {
            System.out.print("Enter student name (or type 'exit' to stop): ");
            String name = inputUtil.readName();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter grade for " + name + ": ");
            int grade = inputUtil.readGrade();
            gradeTracker.addStudent(name, grade);
        }

        if (gradeTracker.getStudents().isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            System.out.println("Average grade: " + gradeTracker.calculateAverage());
            Student highest = gradeTracker.getHighestGradeStudent();
            Student lowest = gradeTracker.getLowestGradeStudent();
            if (highest != null) {
                System.out.println("Highest grade: " + highest.getName() + " with grade " + highest.getGrade());
            }
            if (lowest != null) {
                System.out.println("Lowest grade: " + lowest.getName() + " with grade " + lowest.getGrade());
            }
        }

        inputUtil.close();
        System.out.println("Thank you for using the Student Grade Tracker!");
    }
}

