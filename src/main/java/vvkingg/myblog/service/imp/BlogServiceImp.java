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

    @Override
    public int insertBlog(Blog b) {
        return blogMapper.insertBlog(b);
    }

    @Override
    public int BlogsNumber(){
        return blogMapper.BlogsNumber();
    }

    @Override
    public int DeleteBlog(int id) {
        return blogMapper.DeleteBlog(id);
    }
    @Override
    public int readBlog(int id){
        return  blogMapper.readBlog(id);
    }
    @Override
    public int insertTagBlog(String tag_name,int blog_id){
        return blogMapper.insertTagBlog(tag_name,blog_id);
    }
    @Override
    public List<Blog> selectTagsPage(SerarchBlogsInfo sf){
        return  blogMapper.selectTagsPage(sf);
    }
    @Override
    public int blogsNumberByTag(String tag){
        return  blogMapper.blogsNumberByTag(tag);
    }
    @Override
    public List<String> AllTags(){
        return  blogMapper.AllTags();
    }
}
