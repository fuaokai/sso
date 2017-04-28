package org.fsr.sso.entity;

public class User {
    private Long id;

    private String userName;

    private String userPasswd;

    private String isEnable;

    public User(Long id, String userName, String userPasswd, String isEnable) {
        this.id = id;
        this.userName = userName;
        this.userPasswd = userPasswd;
        this.isEnable = isEnable;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }
}