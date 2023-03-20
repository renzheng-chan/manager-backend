package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Teacheraccount)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:40:05
 */
public class Teacheraccount implements Serializable {
    private static final long serialVersionUID = 714351763361902733L;
    
    private Integer teacherid;
    
    private Integer account;


    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

}

