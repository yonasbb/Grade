package com.gradeclassifier;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
    
    @Test
    public void testStudentWithHighGrades() {
        int[] marks = {95, 90, 92, 88, 95};
        Student student = new Student("John Doe", marks);
        
        assertEquals("John De", student.getName());
        assertEquals(92.0, student.getAverage(), 0.01);
        assertEquals("A", student.getGrade());
    }
    
    @Test
    public void testStudentWithAverageGrades() {
        int[] marks = {75, 80, 85, 70, 75};
        Student student = new Student("Jane Smith", marks);
        
        assertEquals("Jane Smith", student.getName());
        assertEquals(77.0, student.getAverage(), 0.01);
        assertEquals("C", student.getGrade());
    }
    
    @Test
    public void testStudentWithLowGrades() {
        int[] marks = {55, 60, 45, 50, 55};
        Student student = new Student("Bob Wilson", marks);
        
        assertEquals("Bob Wilson", student.getName());
        assertEquals(53.0, student.getAverage(), 0.01);
        assertEquals("F", student.getGrade());
    }
    
    @Test
    public void testStudentWithEmptyMarks() {
        int[] marks = {};
        Student student = new Student("Empty Student", marks);
        
        assertEquals("Empty Student", student.getName());
        assertEquals(0.0, student.getAverage(), 0.01);
        assertEquals("F", student.getGrade());
    }
    
    @Test
    public void testStudentWithNullMarks() {
        Student student = new Student("Null Student", null);
        
        assertEquals("Null Student", student.getName());
        assertEquals(0.0, student.getAverage(), 0.01);
        assertEquals("F", student.getGrade());
    }
} 