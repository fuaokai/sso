package org.fsr.sso.service;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.fsr.sso.dpo.UserDpo;
import org.fsr.sso.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with UserService
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/18 17:36
 */
@Service
public class UserService {

    @Autowired
    private UserDpo userDpo;

    public int register(User user){
        return userDpo.save(user);
    }

    public void login(String userName, String password, boolean rememberMe) {
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            throw new AccountException("用户名或密码不能为空!");
        }

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upToken = new UsernamePasswordToken(userName, password, rememberMe);
        subject.login(upToken);

        if (subject.isAuthenticated()) {

        }
    }
}
