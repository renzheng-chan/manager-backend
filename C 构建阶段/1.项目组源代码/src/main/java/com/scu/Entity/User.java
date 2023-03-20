package com.scu.Entity;

import java.io.Serializable;

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

    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
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

    @Override
    public String toString() {
        return "User [account=" + account + ", password=" + password +"]";
    }
}
