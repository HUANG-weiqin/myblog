package vvkingg.myblog.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import vvkingg.myblog.entity.User;
import vvkingg.myblog.service.UserService;

public class AccountRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;
        User user = userService.selectByName(userToken.getUsername());
        if (user == null){
            throw new UnknownAccountException("账户不存在！");
        }
        return new SimpleAuthenticationInfo(user,user.getUser_password(),"");
    }
}
