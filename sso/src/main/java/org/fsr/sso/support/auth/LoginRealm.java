package org.fsr.sso.support.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.CollectionUtils;
import org.fsr.sso.dpo.RoleDpo;
import org.fsr.sso.dpo.UserDpo;
import org.fsr.sso.entity.User;
import org.fsr.sso.support.constant.BusinessConstant;
import org.fsr.sso.support.exception.BiException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 登录授权
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/19 9:21
 */
public class LoginRealm extends AuthorizingRealm {

    @Autowired
    private UserDpo userDpo;

    @Autowired
    private RoleDpo roleDpo;

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = (String) token.getPrincipal();
        User user = userDpo.byUserName(userName);
        if (user == null) {
            throw new AuthenticationException(String.format("认证失败,[用户名:%s]", userName));
        }
        if (BusinessConstant.STATE_LOCK.equals(user.getIsEnable())) {
            throw new BiException(String.format("认证失败,用户已经被锁定,[用户名:%s]"));
        }
//        List<Role> roles = roleDpo.queryRoleByUserName(userName);

        ByteSource salt = ByteSource.Util.bytes("slat");
        return new SimpleAuthenticationInfo(userName, user.getUserPasswd(), salt, getName());
    }

    /**
     * 授权
     * @param pcl
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pcl) {
        String userName = (String) pcl.getPrimaryPrincipal();
        List<String> list = roleDpo.queryRoleCodeByUserName(userName);

        SimpleAuthorizationInfo sai = null;
        if (!CollectionUtils.isEmpty(list)) {
            sai = new SimpleAuthorizationInfo();
            sai.addRoles(list);
        }
        return sai;
    }
}
