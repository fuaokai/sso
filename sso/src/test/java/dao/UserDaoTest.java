package dao;

import org.fsr.sso.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with UserDao
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/5 10:01
 */
//@ContextConfiguration(locations = {"classpath:dev/spring/applicationContext-core.xml",
//        "classpath:dev/spring/applicationContext-jdbc.xml"})
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    private UserService userService;

    @Test
    public void save(){
//        User user = userService.get(1L);
//
//        System.out.println(user.getUserName());
    }

}
