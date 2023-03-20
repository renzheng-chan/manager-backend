package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:37:10
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 794101978331504504L;
    
    private Integer courseid;
    
    private String coursename;
    
    private Integer teacherid;
    
    private Integer coursecredit;
    
    private String courseroom;
    
    private String coursetime;
    
    private String coursedescription;


    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getCoursecredit() {
        return coursecredit;
    }

    public void setCoursecredit(Integer coursecredit) {
        this.coursecredit = coursecredit;
    }

    public String getCourseroom() {
        return courseroom;
    }

    public void setCourseroom(String courseroom) {
        this.courseroom = courseroom;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }

}

