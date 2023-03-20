package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Classinfo)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:36:52
 */
public class Classinfo implements Serializable {
    private static final long serialVersionUID = -69785819654500345L;
    
    private Integer classid;
    
    private Integer grade;
    
    private Integer stuid;
    
    private Integer teacherid;


    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

}

