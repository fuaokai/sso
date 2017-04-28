<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2017/4/1
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
    <head>
        <title>登录</title>
    </head>
    <body>
    <shiro:guest>
        欢迎游客
    </shiro:guest>
    <br/>
    <shiro:hasRole name="kaikai">
        kaikaikai
    </shiro:hasRole>
        <form name="loginForm" method="post" action="/sso/login.html">
            <table>
                <tr>
                    <td>用户名</td>
                    <td><input type="text" name="userName"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>自动登录</td>
                    <td><input type="checkbox" name="rememberMe"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="提交"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
