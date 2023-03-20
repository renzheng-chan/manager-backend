package scu.com.demo.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-07-17 09:40:21
 */
public class User implements Serializable {
    private static final long serialVersionUID = -30372083923737200L;
    /**
     * 账号
     */
    private Integer account;
    /**
     * 密码
     */
    private String password;
    /**
     * 角色
     */
    private String role;


    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

