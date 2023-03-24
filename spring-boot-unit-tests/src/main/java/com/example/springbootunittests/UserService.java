package com.example.springbootunittests;

import com.example.springbootunittests.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
