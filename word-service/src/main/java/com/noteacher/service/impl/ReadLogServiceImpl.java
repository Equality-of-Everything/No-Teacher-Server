package com.noteacher.service.impl;

import com.noteacher.entity.ReadLog;
import com.noteacher.mapper.ReadLogMapper;
import com.noteacher.service.ReadLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/24 14:18
 * @Decription :
 */

@Service
public class ReadLogServiceImpl implements ReadLogService {
    @Autowired
    private ReadLogMapper readLogMapper;


    @Override
    public Integer addReadLog(ReadLog readLog) {
        return readLogMapper.insert(readLog);
    }

    @Override
    public Long getTodayReadDurationByUserId(String userId) {
        return readLogMapper.getTodayReadDuration(userId);
    }
}
