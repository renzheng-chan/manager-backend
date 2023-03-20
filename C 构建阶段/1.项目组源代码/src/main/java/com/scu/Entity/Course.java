package com.scu.Entity;

public class Course {
    private int courseID;
    private String courseName;
    private int teacherID;
    private int courseCredit;
    private String courseRoom;
    private String courseTime;
    private String courseDescription;
    private String teacherName;

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public int getCourseID() {
        return courseID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public String getCourseTime() {
        return courseTime;
    }

    @Override
    public String toString() {
        return "{" + this.courseID + "，" + this.courseName + "，" + this.teacherID + "，" + this.teacherName + "，" + this.courseCredit + "，" + this.courseRoom + "，" + this.courseTime + "，" + this.courseDescription + "}";
    }
}
