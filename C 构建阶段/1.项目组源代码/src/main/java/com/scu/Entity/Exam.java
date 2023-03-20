package com.scu.Entity;

public class Exam {
    private int courseID;
    private String courseName;
    private String examTime;
    private String examRoom;
    private int examSeat;
    private int stuID;

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getExamSeat() {
        return examSeat;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getExamRoom() {
        return examRoom;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamRoom(String examRoom) {
        this.examRoom = examRoom;
    }

    public void setExamSeat(int examSeat) {
        this.examSeat = examSeat;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    @Override
    public String toString() {
        return "{"+this.courseID+"，"+this.courseName+"，"+this.examTime+"，"+this.examRoom+"，"+this.examSeat+"}";
    }
}

