package vvkingg.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vvkingg.myblog.entity.Blog;

import java.util.List;

@Mapper
@Repository
public interface BlogMapper {
    public List<Blog> selectAll();
}
