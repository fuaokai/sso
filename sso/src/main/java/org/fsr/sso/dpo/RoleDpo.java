package org.fsr.sso.dpo;

import org.fsr.sso.dao.RoleMapper;
import org.fsr.sso.dao.UserRoleMapper;
import org.fsr.sso.entity.Role;
import org.fsr.sso.support.exception.DpoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with RoleDpo
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/23 17:59
 */
@Component
public class RoleDpo {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 根据用户名查询权限
     * @param userName 用户名
     */
    public List<Role> queryRoleByUserName(String userName) throws DpoException {
        return roleMapper.queryRolesByUserName(userName);
    }

    public List<String> queryRoleCodeByUserName(String userName) throws DpoException {
        return roleMapper.queryRoleCodeByUserName(userName);
    }
}
