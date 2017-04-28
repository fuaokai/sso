package org.fsr.sso.entity;

import java.util.Date;

public class Role {
    private Long id;

    private String roleCode;

    private String roleName;

    private String createBy;

    private Date createDate;

    private String isEnable;

    public Role(Long id, String roleCode, String roleName, String createBy, Date createDate, String isEnable) {
        this.id = id;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.createBy = createBy;
        this.createDate = createDate;
        this.isEnable = isEnable;
    }

    public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }
}