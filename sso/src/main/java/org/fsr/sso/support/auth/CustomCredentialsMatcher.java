package org.fsr.sso.support.auth;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

/**
 * Created with CustomCredentialsMatcher
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/26 17:13
 */
public class CustomCredentialsMatcher extends HashedCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

        boolean isMatcher = super.doCredentialsMatch(token, info);

        return isMatcher;
    }
}
