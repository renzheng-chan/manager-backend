package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Manager)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:37:48
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = 155393418295204507L;
    
    private Integer managerid;
    
    private String managername;
    
    private Integer account;


    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

}

