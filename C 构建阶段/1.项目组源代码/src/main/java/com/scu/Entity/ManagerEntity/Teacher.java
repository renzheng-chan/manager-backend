package com.scu.Entity.ManagerEntity;
import java.io.Serializable;
public class Teacher implements Serializable {
    private Integer teacherID;
    private String  teacherName;
    private Integer teacherAge;
    private String  teacherSex;
    private String  teacherOBTime;
    private String  teacherTitle;
    private String  teacherDept;
    public Teacher(Integer teacherID, String teacherName, Integer teacherAge, String teacherSex, String teacherOBTime, String teacherTitle, String teacherDept) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
        this.teacherSex = teacherSex;
        this.teacherOBTime = teacherOBTime;
        this.teacherTitle = teacherTitle;
        this.teacherDept = teacherDept;
    }

    public Teacher() {
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherAge=" + teacherAge +
                ", teacherSex='" + teacherSex + '\'' +
                ", teacherOBTime=" + teacherOBTime +
                ", teacherTitle='" + teacherTitle + '\'' +
                ", teacherDept='" + teacherDept + '\'' +
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

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherOBTime() {
        return teacherOBTime;
    }

    public void setTeacherOBTime(String teacherOBTime) {
        this.teacherOBTime = teacherOBTime;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }

    public String getTeacherDept() {
        return teacherDept;
    }

    public void setTeacherDept(String teacherDept) {
        this.teacherDept = teacherDept;
    }
}