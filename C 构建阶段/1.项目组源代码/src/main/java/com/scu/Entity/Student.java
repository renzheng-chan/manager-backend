package com.scu.Entity;

public class Student {
    private int stuID;
    private String stuName;
    private String stuSex;
    private int stuAge;
    private int stuGrade;
    private int classID;
    private String stuDept;
    private String stuADTime;

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public void setStuADTime(String stuADTime) {
        this.stuADTime = stuADTime;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getStuADTime() {
        return stuADTime;
    }

    public String getStuDept() {
        return stuDept;
    }

    public int getStuGrade() {
        return stuGrade;
    }

    public int getClassID() {
        return classID;
    }

    public int getStuAge() {
        return stuAge;
    }

    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuSex() {
        return stuSex;
    }


    @Override
    public String toString() {
        return "{"+this.stuID + "，" + this.stuName + "，" + this.stuSex + "，" + this.stuAge + "，" + this.stuGrade + "，" + this.classID + "，" + this.stuDept + "，" + this.stuAge+"}";
    }
}
