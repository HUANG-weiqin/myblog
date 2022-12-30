package vvkingg.myblog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vvkingg.myblog.entity.User;
import vvkingg.myblog.mapper.UserMapper;
import vvkingg.myblog.service.UserService;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public User selectByName(String name){return  userMapper.selectByName(name);}
}
