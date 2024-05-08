package com.noteacher.service.impl;

import com.noteacher.entity.UserLevel;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/8 9:19
 * @Decription :
 */

@Service
public class UserLevelServiceImpl implements UserLevelService {

    @Autowired
    private UserLevelMapper userLevelMapper;

    @Override
    public Integer insertUserLevel(String userId, String unknowWordId, String knowWordId) {
        String id = UUID.randomUUID().toString();
        UserLevel userLevel = new UserLevel();
        userLevel.setId(id);
        userLevel.setUserId(userId);
        userLevel.setUnknowWordId(unknowWordId);
        userLevel.setKnowWordId(knowWordId);
        Integer res = userLevelMapper.insert(userLevel);
        return res;
    }

    @Override
    public UserLevel getUserLevelByUserId(String userId) {
        UserLevel res = userLevelMapper.getUserLevelByUserId(userId);
        return res;
    }
}
