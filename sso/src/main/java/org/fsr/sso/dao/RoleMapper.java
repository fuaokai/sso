package org.fsr.sso.dao;

import org.fsr.sso.dao.example.RoleExample;
import org.fsr.sso.entity.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectByExample(RoleExample example);

    List<Role> queryRolesByUserName(String userName);

    List<String> queryRoleCodeByUserName(String userName);
}