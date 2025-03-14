package com.software.service.impl;

import cn.hutool.system.UserInfo;
import com.software.mapper.UserMapper;
import com.software.service.UserInfoService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 10:00
 * @Decription :
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer updateUserAvatar(String userId, String avatar) {
        Integer res = userMapper.updateUserAvatar(userId, avatar);
        return res;
    }

    @Override
    public Integer UpdateUserInfo(String userId, String userName, String avatar, String birthdate, String sex) {
        Integer res = userMapper.UpdateUserInfo(userId, userName, avatar, birthdate, sex);
        return res;
    }

    @Override
    public User getUserByUserId(String userId) {
        return userMapper.selectUserById(userId);
    }

}
