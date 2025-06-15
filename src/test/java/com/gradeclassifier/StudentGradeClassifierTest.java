package com.gradeclassifier;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeClassifierTest {
    
    private StudentGradeClassifier classifier = new StudentGradeClassifier();
    
    @Test
    public void testClassifyGradeA() {
        assertEquals("A", classifier.classifyGrade(95));
        assertEquals("A", classifier.classifyGrade(90));
    }
    
    @Test
    public void testClassifyGradeB() {
        assertEquals("B", classifier.classifyGrade(85));
        assertEquals("B", classifier.classifyGrade(80));
    }
    
    @Test
    public void testClassifyGradeC() {
        assertEquals("C", classifier.classifyGrade(75));
        assertEquals("C", classifier.classifyGrade(70));
    }
    
    @Test
    public void testClassifyGradeD() {
        assertEquals("D", classifier.classifyGrade(65));
        assertEquals("D", classifier.classifyGrade(60));
    }
    
    @Test
    public void testClassifyGradeF() {
        assertEquals("F", classifier.classifyGrade(55));
        assertEquals("F", classifier.classifyGrade(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidScoreNegative() {
        classifier.classifyGrade(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidScoreOver100() {
        classifier.classifyGrade(101);
    }
    
    @Test
    public void testGradeDescriptionA() {
        assertEquals("Excellent", classifier.getGradeDescription("A"));
    }
    
    @Test
    public void testGradeDescriptionB() {
        assertEquals("Good", classifier.getGradeDescription("B"));
    }
    
    @Test
    public void testGradeDescriptionC() {
        assertEquals("Average", classifier.getGradeDescription("C"));
    }
    
    @Test
    public void testGradeDescriptionD() {
        assertEquals("Below Average", classifier.getGradeDescription("D"));
    }
    
    @Test
    public void testGradeDescriptionF() {
        assertEquals("Failed", classifier.getGradeDescription("F"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidGrade() {
        classifier.getGradeDescription("X");
    }
} 