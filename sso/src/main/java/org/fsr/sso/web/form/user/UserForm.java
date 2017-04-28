package org.fsr.sso.web.form.user;

/**
 * Created with UserForm
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/25 16:00
 */
public class UserForm {
    private String userName;

    private String userPasswd;

    public UserForm() {
    }

    public UserForm(String userName, String userPasswd) {
        this.userName = userName;
        this.userPasswd = userPasswd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }
}
