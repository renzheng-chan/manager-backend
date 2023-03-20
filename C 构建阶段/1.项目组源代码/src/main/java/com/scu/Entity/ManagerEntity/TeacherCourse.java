package com.scu.Entity.ManagerEntity;

public class TeacherCourse {
    private Integer teacherID;
    private String teacherName;
    private Integer courseID;
    private String courseName;
    private Integer courseCredit;
    private String courseRoom;
    private String courseTime;
    private String courseDescription;

    public TeacherCourse(Integer teacherID, String teacherName, Integer courseID, String courseName, Integer courseCredit, String courseRoom, String courseTime, String courseDescription) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.courseRoom = courseRoom;
        this.courseTime = courseTime;
        this.courseDescription = courseDescription;
    }

    public TeacherCourse() {
    }
    @Override
    public String toString() {
        return "TeacherCourse{" +
                "teacherID=" + teacherID +
                ", teacherName='" + teacherName + '\'' +
                ", courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                ", courseRoom='" + courseRoom + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
