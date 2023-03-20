package com.scu.Entity;

import com.scu.Service.stuScoreService;

public class Score {
    stuScoreService stuScoreService;
    private int courseID;
    private int score;
    private int teacherID;
    private int stuID;
    private int courseCredit;
    private double gpa;
    private String courseName;
    private String teacherName;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getStuID() {
        return stuID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{"+this.courseID+"，"+this.courseName+"，"+this.score+"，"+this.teacherID+"，"+this.teacherName+"}";
    }
}
