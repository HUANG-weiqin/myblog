package vvkingg.myblog.service;

import org.springframework.stereotype.Service;
import vvkingg.myblog.entity.User;

import java.util.List;


public interface UserService {
    public List<User> selectAll();
}
