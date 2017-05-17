package org.shu.association.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 13:31
 */
public class User {
    private String userId;
    private String password;
    private String cookie;

    private String userName;
    private String userQq;
    private String userPhone;
    private String userEmail;

    private Date gmtCreate;
    private Date gmtModified;

    public User() {
    }

    public User(String userId, String password, String cookie, String userName, String userQq, String userPhone,
                String userEmail) {
        this.userId = userId;
        this.password = password;
        this.cookie = cookie;
        this.userName = userName;
        this.userQq = userQq;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

    public User(String userId, String password, String cookie, String userName) {

        this.userId = userId;
        this.password = password;
        this.cookie = cookie;
        this.userName = userName;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
