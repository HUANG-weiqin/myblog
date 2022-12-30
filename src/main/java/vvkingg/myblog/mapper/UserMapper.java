package vvkingg.myblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vvkingg.myblog.entity.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> selectAll();
    User selectByName(String name);
}
