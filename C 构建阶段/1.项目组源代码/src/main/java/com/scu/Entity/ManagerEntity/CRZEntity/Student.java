package com.scu.Entity.ManagerEntity.CRZEntity;

import java.sql.Timestamp;
import java.util.Date;

public class Student {
    private Integer stuID;
    private String stuName;
    private Integer stuClass;
    private Integer stuAge;
    private Integer stuGrade;
    private String stuDept;
    private String stuSex;
    private String stuADTime;

    public Student() {
    }

    public Student(Integer stuID, String stuName, Integer stuClass, Integer stuAge, Integer stuGrade, String stuDept, String stuSex, String stuADTime) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuAge = stuAge;
        this.stuGrade = stuGrade;
        this.stuDept = stuDept;
        this.stuSex = stuSex;
        this.stuADTime = stuADTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", stuClass=" + stuClass +
                ", stuAge=" + stuAge +
                ", stuGrade=" + stuGrade +
                ", stuDept='" + stuDept + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuADTime=" + stuADTime +
                '}';
    }

    public Integer getStuID() {
        return stuID;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(Integer stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuDept() {
        return stuDept;
    }

    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuADTime() {
        return stuADTime;
    }

    public void setStuADTime(String stuADTime) {
        this.stuADTime = stuADTime;
    }
}
