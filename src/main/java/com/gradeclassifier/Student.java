package com.gradeclassifier;

public class Student {
    private String name;
    private int[] marks;
    private double average;
    private String grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateAverage();
        determineGrade();
    }

    private void calculateAverage() {
        if (marks == null || marks.length == 0) {
            average = 0;
            return;
        }
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / marks.length;
    }

    private void determineGrade() {
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }
} 