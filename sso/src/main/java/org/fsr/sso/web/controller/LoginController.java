package org.fsr.sso.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.fsr.sso.service.UserService;
import org.fsr.sso.support.constant.SystemConstant;
import org.fsr.sso.support.web.WebResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登录
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/12 14:58
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginIndex", method = RequestMethod.GET)
    public String loginindex() {
        return "login";
    }

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public String token(String userName, String password, String rememberMe) {
        try {
            boolean isRememberMe = SystemConstant.REMEMBER_ME_VALUE.equals(rememberMe);
            userService.login(userName, password, isRememberMe);
        } catch (AuthenticationException ex) {
            logger.error("登录验证失败，[用户名:{}, 密码:{}]", userName, password);
            throw new AuthenticationException(ex);
        }

        return "index";
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }

        return WebResultUtil.toJSON(WebResultUtil.SUCCESS);
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(String userName, String password, String rememberMe) {
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            UsernamePasswordToken upToken = new UsernamePasswordToken(userName, password);
//            if (SystemConstant.REMEMBER_ME_VALUE.equals(rememberMe)) {
//                upToken.setRememberMe(true);
//            }
//
//            //密码匹配是跟slat相关
//            subject.login(upToken);
//        } catch (AuthenticationException ex) {
//            logger.error("登录验证失败，[用户名:{}, 密码:{}]", userName, password);
//            throw new AuthenticationException(ex);
//        }
//
//        return "index";
//    }

}
