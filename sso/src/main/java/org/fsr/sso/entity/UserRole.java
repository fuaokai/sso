package org.fsr.sso.entity;

public class UserRole {
    private Long id;

    private String userName;

    private String roleCode;

    private String isEnable;

    public UserRole(Long id, String userName, String roleCode, String isEnable) {
        this.id = id;
        this.userName = userName;
        this.roleCode = roleCode;
        this.isEnable = isEnable;
    }

    public UserRole() {
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

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }
}