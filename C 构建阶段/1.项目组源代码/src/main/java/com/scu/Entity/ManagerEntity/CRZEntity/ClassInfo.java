package com.scu.Entity.ManagerEntity.CRZEntity;

public class ClassInfo {
    private Integer classID;
    private Integer stuNumber;
    private Integer Grade;
    private String  Dept;

    public ClassInfo() {
    }

    public ClassInfo(Integer classID, Integer stuNumber, Integer grade, String dept) {
        this.classID = classID;
        this.stuNumber = stuNumber;
        Grade = grade;
        Dept = dept;
    }

    public ClassInfo(Integer classID, Integer grade, String dept) {
        this.classID = classID;
        Grade = grade;
        Dept = dept;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public Integer getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Integer stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer grade) {
        Grade = grade;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
