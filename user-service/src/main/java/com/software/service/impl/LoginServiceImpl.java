package com.software.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.software.mapper.UserMapper;
import com.software.service.LoginService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 8:30
 * @Decription :
 */

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public User login(String email) {
        // 如何数据库没有这个数据，则先进行注册
        User user = userMapper.selectUserByEmail(email);
        if (user == null) {
            String avatarUrl = "https://qiwusky.oss-cn-beijing.aliyuncs.com/f91ef610-f32f-49f0-b13d-4c7d4cc0f268.jpg";
            User newUser = new User();
            newUser.setUserId(UUID.randomUUID().toString());
            newUser.setEmail(email);
            newUser.setAvatar(avatarUrl);
            newUser.setUsername(RandomUtil.randomString(8));
            newUser.setCode(null);
            newUser.setBirthdate(null);
            newUser.setLevel(null);
            userMapper.insert(newUser);
            return newUser;
        }
        return user;
    }
}
