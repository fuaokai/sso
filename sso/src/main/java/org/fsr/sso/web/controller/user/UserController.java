package org.fsr.sso.web.controller.user;

import org.fsr.sso.entity.User;
import org.fsr.sso.service.UserService;
import org.fsr.sso.support.web.WebResultUtil;
import org.fsr.sso.web.form.user.UserForm;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制器
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/25 15:58
 */
@RestController("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(UserForm userForm) {
        String json = null;
        try {
            User user = new User();
            BeanUtils.copyProperties(userForm, user);
            userService.register(user);
            json = WebResultUtil.toJSON(WebResultUtil.SUCCESS);
        } catch (Exception ex) {
            ex.printStackTrace();
            json = WebResultUtil.toJSON(WebResultUtil.FAIL);
        }

        return json;
    }
}
