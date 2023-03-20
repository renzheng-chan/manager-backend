package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:39:02
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -99951583871142357L;
    
    private Integer stuid;
    
    private String stuname;
    
    private String stusex;
    
    private Integer stuage;
    
    private Integer stugrade;
    
    private String studept;
    
    private String stuadtime;
    
    private Integer classid;


    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Integer getStugrade() {
        return stugrade;
    }

    public void setStugrade(Integer stugrade) {
        this.stugrade = stugrade;
    }

    public String getStudept() {
        return studept;
    }

    public void setStudept(String studept) {
        this.studept = studept;
    }

    public String getStuadtime() {
        return stuadtime;
    }

    public void setStuadtime(String stuadtime) {
        this.stuadtime = stuadtime;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

}

