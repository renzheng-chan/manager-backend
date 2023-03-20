package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (Stuaccount)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:38:34
 */
public class Stuaccount implements Serializable {
    private static final long serialVersionUID = 141153317003732229L;
    
    private Integer account;
    
    private Integer stuid;


    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

}

