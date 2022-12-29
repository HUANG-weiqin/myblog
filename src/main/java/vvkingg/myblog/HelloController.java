package vvkingg.myblog;

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
}
