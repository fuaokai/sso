package org.fsr.sso.entity;

public class RolePermission {
    private Long id;

    private String permissionCode;

    private String permissionName;

    private String isEnable;

    public RolePermission(Long id, String permissionCode, String permissionName, String isEnable) {
        this.id = id;
        this.permissionCode = permissionCode;
        this.permissionName = permissionName;
        this.isEnable = isEnable;
    }

    public RolePermission() {
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

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }
}