package org.fsr.sso.dpo;

import org.apache.shiro.util.CollectionUtils;
import org.fsr.sso.dao.UserMapper;
import org.fsr.sso.dao.example.UserExample;
import org.fsr.sso.entity.User;
import org.fsr.sso.support.exception.DpoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with UserDpo
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/23 17:28
 */
@Component
public class UserDpo {

    @Autowired
    private UserMapper userMapper;

    public User byUserName(String userName){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        List<User> list = userMapper.selectByExample(userExample);
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    public User byId(Long id) throws DpoException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        List<User> list = userMapper.selectByExample(userExample);
        return CollectionUtils.isEmpty(list) ? null : list.get(0);
    }

    public int save(User user) throws DpoException {
        return userMapper.insertSelective(user);
    }
}
