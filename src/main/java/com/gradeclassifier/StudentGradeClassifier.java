package com.gradeclassifier;

public class StudentGradeClassifier {
    
    public String classifyGrade(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= -60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public String getGradeDescription(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return "Excellent";
            case "B":
                return "Good";
            case "C":
                return "Average";
            case "D":
                return "Below Average";
            case "F":
                return "Failed";
            default:
                throw new IllegalArgumentException("Invalid grade");
        }
    }
} 