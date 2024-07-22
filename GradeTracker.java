package com.tracker.model;

import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private List<Student> students;

    public GradeTracker() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int grade) {
        students.add(new Student(name, grade));
    }

    public List<Student> getStudents() {
        return students;
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return total / (double) students.size();
    }

    public Student getHighestGradeStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > highest.getGrade()) {
                highest = student;
            }
        }
        return highest;
    }

    public Student getLowestGradeStudent() {
        if (students.isEmpty()) {
            return null;
        }

        Student lowest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }
        return lowest;
    }
}
