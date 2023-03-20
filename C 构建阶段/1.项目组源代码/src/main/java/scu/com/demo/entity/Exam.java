package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Exam)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:37:34
 */
public class Exam implements Serializable {
    private static final long serialVersionUID = -27778678091969168L;
    
    private Integer courseid;
    
    private String examtime;
    
    private String examroom;
    
    private Integer examseat;
    
    private Integer stuid;


    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime;
    }

    public String getExamroom() {
        return examroom;
    }

    public void setExamroom(String examroom) {
        this.examroom = examroom;
    }

    public Integer getExamseat() {
        return examseat;
    }

    public void setExamseat(Integer examseat) {
        this.examseat = examseat;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

}

