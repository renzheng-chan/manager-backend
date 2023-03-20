package com.scu.Entity.ManagerEntity;
import java.io.Serializable;

public class Course implements Serializable {
    private Integer  courseID;
    private String   courseName;
    private Integer  teacherID;
    private Integer  courseCredit;
    private String   courseRoom;
    private String   courseTime;
    private String   courseDescription;

    public Course() {
    }

    public Course(Integer courseID, String courseName, Integer teacherID, Integer courseCredit, String courseRoom,String courseTime, String courseDescription) {
        this.courseID = courseID;
        this.teacherID = teacherID;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.courseCredit = courseCredit;
        this.courseRoom = courseRoom;
        this.courseDescription = courseDescription;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", teacherID=" + teacherID +
                ", courseName='" + courseName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", courseCredit=" + courseCredit +
                ", courseRoom='" + courseRoom + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}

