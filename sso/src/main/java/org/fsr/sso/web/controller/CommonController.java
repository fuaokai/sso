package org.fsr.sso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共页面控制器
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/25 15:45
 */
@Controller
@RequestMapping("/common")
public class CommonController {

    @RequestMapping(value = "/success")
    public String success(String userName, String password) {
        return "common/success";
    }

    @RequestMapping(value = "/fail")
    public String fail(String userName, String password) {
        return "common/fail";
    }


    @RequestMapping(value = "/test")
    public String test(String userName, String password) {
        return "common/test";
    }


}
