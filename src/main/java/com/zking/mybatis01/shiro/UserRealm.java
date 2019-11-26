package com.zking.mybatis01.shiro;

import com.zking.mybatis01.model.TSysUser;
import com.zking.mybatis01.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @create 2019-11-2421:09
 */
public class UserRealm extends AuthorizingRealm {

    @Resource
    private IUserService userService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


    /**
     * 认证
     * @param token 认证对象，可以获取
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String userName = token.getPrincipal().toString();
        TSysUser user  = userService.load(userName);

        //账户不存在
        if(ObjectUtils.isEmpty(user)) {
            throw new UnknownAccountException();
        }

        //不考虑加密
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                this.getName()
        );

        return authenticationInfo;
    }

}
