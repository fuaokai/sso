package org.fsr.sso.dao;

import org.fsr.sso.dao.example.RolePermissionExample;
import org.fsr.sso.entity.RolePermission;

import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}