package vvkingg.myblog;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vvkingg.myblog.service.UserService;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String sayhello(){
        return userService.selectAll().toString();
    }

    @RequestMapping("/login")
    public String sayLogin(){

        UsernamePasswordToken token = new UsernamePasswordToken("vvkingg","hwq741852896");
        try {
            SecurityUtils.getSubject().login(token);
        }
        catch (UnknownAccountException e) {
            return "用户不存在";
        } catch (IncorrectCredentialsException e) {
            return "密码不正确";
        }
        return "成功";
    }

    @RequestMapping("/fuck")
    public String sayfuck(){
        return userService.selectAll().toString();
    }
}
