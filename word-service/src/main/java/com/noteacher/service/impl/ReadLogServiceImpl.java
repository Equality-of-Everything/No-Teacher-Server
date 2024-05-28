package com.noteacher.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.noteacher.entity.ReadLog;
import com.noteacher.entity.UserLevel;
import com.noteacher.mapper.ReadLogMapper;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.service.ReadLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/24 14:18
 * @Decription :
 */

@Service
public class ReadLogServiceImpl implements ReadLogService {
    @Autowired
    private ReadLogMapper readLogMapper;

    @Autowired
    private UserLevelMapper userLevelMapper;


    @Override
    public Integer addReadLog(ReadLog readLog) {
        return readLogMapper.insert(readLog);
    }

    @Override
    public Long getTodayReadDurationByUserId(String userId) {
        return readLogMapper.getTodayReadDuration(userId);
    }

    @Override
    public Integer getTodayWOrdNumByUserId(String userId) {
        String res = userLevelMapper.getKnowWordIdByUserId(userId);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        List list = gson.fromJson(res, listType);
        Integer num = list.size();
        return num;
    }
}
