package vvkingg.myblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vvkingg.myblog.entity.User;
import vvkingg.myblog.mapper.UserMapper;
import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
