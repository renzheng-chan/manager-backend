package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:39:35
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = -81647271601688521L;
    
    private Integer teacherid;
    
    private String teachername;
    
    private Integer teacherage;
    
    private String teachersex;
    /**
     * 入职时间(String)
     */
    private String teacherobtime;
    /**
     * 职称
     */
    private String teachertitle;
    /**
     * 院系
     */
    private String teacherdept;


    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public Integer getTeacherage() {
        return teacherage;
    }

    public void setTeacherage(Integer teacherage) {
        this.teacherage = teacherage;
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex;
    }

    public String getTeacherobtime() {
        return teacherobtime;
    }

    public void setTeacherobtime(String teacherobtime) {
        this.teacherobtime = teacherobtime;
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public void setTeachertitle(String teachertitle) {
        this.teachertitle = teachertitle;
    }

    public String getTeacherdept() {
        return teacherdept;
    }

    public void setTeacherdept(String teacherdept) {
        this.teacherdept = teacherdept;
    }

}

