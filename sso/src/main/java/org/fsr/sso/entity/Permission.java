package org.fsr.sso.entity;

import java.util.Date;

public class Permission {
    private Long id;

    private String permissionCode;

    private String permissionName;

    private String createBy;

    private Date createDate;

    private String isEnable;

    public Permission(Long id, String permissionCode, String permissionName, String createBy, Date createDate, String isEnable) {
        this.id = id;
        this.permissionCode = permissionCode;
        this.permissionName = permissionName;
        this.createBy = createBy;
        this.createDate = createDate;
        this.isEnable = isEnable;
    }

    public Permission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
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