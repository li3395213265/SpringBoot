package com.hp.service;

import com.hp.jopo.User;
import com.hp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User query(Long id) {
        return  userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void delete(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queyuser() {

        return  userMapper.selectAll();
    }
}
