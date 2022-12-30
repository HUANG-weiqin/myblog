package vvkingg.myblog.controllers;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vvkingg.myblog.common.Result;
import vvkingg.myblog.common.SerarchBlogsInfo;
import vvkingg.myblog.entity.Blog;
import vvkingg.myblog.mapper.BlogMapper;
import vvkingg.myblog.service.BlogService;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
    @PostMapping("/blogs")
    public Result blogs(SerarchBlogsInfo sf){
        List<Blog> res = blogService.selectPage(sf);
        return Result.success("ok",res);
    }
}
