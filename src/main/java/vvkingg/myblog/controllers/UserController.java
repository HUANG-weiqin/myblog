package vvkingg.myblog.controllers;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vvkingg.myblog.common.LoginInfo;
import vvkingg.myblog.common.Result;

@RestController
public class UserController {

    @PostMapping("/login")
    public Result login(LoginInfo lf){
        UsernamePasswordToken token = new UsernamePasswordToken(lf.getName(),lf.getPassword());
        try {
            SecurityUtils.getSubject().login(token);
        }
        catch (UnknownAccountException e) {
            return Result.fail(400,"user name error",null);
        } catch (IncorrectCredentialsException e) {
            return Result.fail(400,"user password error",null);
        }

        return Result.success("login ok",null);
    }

    @RequestMapping("/logout")
    public  Result logout(){
        SecurityUtils.getSubject().logout();
        return  Result.success("logout ok",null);
    }
}
