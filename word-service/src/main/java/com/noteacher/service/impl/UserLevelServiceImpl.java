package com.noteacher.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.noteacher.client.UserClient;
import com.noteacher.entity.Result;
import com.noteacher.entity.UserLevel;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.mapper.WordMapper;
import com.noteacher.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.lang.reflect.Type;
import java.util.List;
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

    @Autowired
    private WordMapper wordMapper;;

    @Autowired
    private UserClient userClient;


    @Transactional
    @Override
    public Integer insertUserLevel(String userId, String unknowWordId, String knowWordId) {
        String id = UUID.randomUUID().toString();
        UserLevel userLevel = new UserLevel();
        userLevel.setId(id);
        userLevel.setUserId(userId);
        userLevel.setUnknowWordId(unknowWordId);
        userLevel.setKnowWordId(knowWordId);
        Integer res = userLevelMapper.insert(userLevel);
        Integer lexile = getLexileByUserId(userId);
        Result result = userClient.updateLexile(userId, lexile);
        return res;
    }

    @Override
    public UserLevel getUserLevelByUserId(String userId) {
        UserLevel res = userLevelMapper.getUserLevelByUserId(userId);
        return res;
    }

    @Override
    public Integer getLexileByUserId(String userId) {
        String res = userLevelMapper.getKnowWordIdByUserId(userId);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        List list = gson.fromJson(res, listType);
        double listSize = Double.valueOf(list.size());
        double lexile = listSize / wordMapper.getWordNum()*100;
        if(lexile<65) return 110;
        return 150;
    }
}
