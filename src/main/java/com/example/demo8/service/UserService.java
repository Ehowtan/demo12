package com.example.demo8.service;

import com.example.demo8.entity.User;
import com.example.demo8.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void addUser(User user) {
        userMapper.insertUser(user);
    }
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }
    // 根据用户名查询用户
    public List<User> findUsersByName(String name) {
        return userMapper.findUsersByName(name); // 调用 MyBatis 的查询方法
    }



}
