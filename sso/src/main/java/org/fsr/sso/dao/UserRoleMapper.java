package org.fsr.sso.dao;

import org.fsr.sso.dao.example.UserRoleExample;
import org.fsr.sso.entity.UserRole;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}