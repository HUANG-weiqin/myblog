package vvkingg.myblog.service;

import vvkingg.myblog.common.SerarchBlogsInfo;
import vvkingg.myblog.entity.Blog;

import java.util.List;

public interface BlogService {
    public List<Blog> selectAll();
    public List<Blog> selectPage(SerarchBlogsInfo sf);
}
