package org.fsr.sso.dao;

import org.fsr.sso.dao.example.UserExample;
import org.fsr.sso.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int insert(User record);

    int insertSelective(User record);
}