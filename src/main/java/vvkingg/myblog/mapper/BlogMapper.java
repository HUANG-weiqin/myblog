package vvkingg.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vvkingg.myblog.common.SerarchBlogsInfo;
import vvkingg.myblog.entity.Blog;

import java.util.List;

@Mapper
@Repository
public interface BlogMapper {
    public List<Blog> selectAll();
    public List<Blog> selectPage(SerarchBlogsInfo sf);
    public int insertBlog(Blog b);
    public int BlogsNumber();

    public int DeleteBlog(int id);
    public int readBlog(int id);

    public int insertTagBlog(String tag_name,int blog_id);

    public List<Blog> selectTagsPage(SerarchBlogsInfo sf);

    public int blogsNumberByTag(String tag);

    public List<String> AllTags();
}
