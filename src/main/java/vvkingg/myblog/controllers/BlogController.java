package vvkingg.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import vvkingg.myblog.common.Result;
import vvkingg.myblog.common.SerarchBlogsInfo;
import vvkingg.myblog.entity.Blog;
import vvkingg.myblog.service.BlogService;
import vvkingg.myblog.tools.FileHandleUtil;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
    @PostMapping("/blogs")
    public Result blogs(SerarchBlogsInfo sf){
        List<Blog> res = blogService.selectPage(sf);
        return Result.success("ok",res);
    }

    @PostMapping("/add_blogs")
    public Result blogs(Blog sf){
        sf.setAuthor_id(1);
        blogService.insertBlog(sf);
        return Result.success("ok",sf.getBlog_id());
    }

    @RequestMapping("/upload_file")
    public Result upload(@RequestParam("file") MultipartFile file) {

        String [] splits = file.getOriginalFilename().split("\\.");
        if(splits.length == 0){
            return Result.fail(111,"file name null",null);
        }
        String ext =  splits[splits.length - 1];

        String randName = UUID.randomUUID().toString() + "." + ext;

        try {
            String st = FileHandleUtil.upload(file.getInputStream(),"",randName);
        }catch (Exception e){
            return Result.fail(1,"bad file",null);
        }


        Map<String ,String > map = new HashMap<>();
        map.put("url","Files/" + randName);
        return Result.success("ok",map);
    }
}
