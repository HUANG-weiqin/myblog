package vvkingg.myblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vvkingg.myblog.common.SerarchBlogsInfo;
import vvkingg.myblog.entity.Blog;
import vvkingg.myblog.mapper.BlogMapper;
import vvkingg.myblog.service.BlogService;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<Blog> selectAll() {
        return blogMapper.selectAll();
    }

    @Override
    public List<Blog> selectPage(SerarchBlogsInfo sf) {
        return blogMapper.selectPage(sf);
    }
}
