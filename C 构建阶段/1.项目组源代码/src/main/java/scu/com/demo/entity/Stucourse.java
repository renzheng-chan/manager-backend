package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Stucourse)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:38:47
 */
public class Stucourse implements Serializable {
    private static final long serialVersionUID = -56605256576448765L;
    
    private Integer stuid;
    
    private Integer courseid;


    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

}

