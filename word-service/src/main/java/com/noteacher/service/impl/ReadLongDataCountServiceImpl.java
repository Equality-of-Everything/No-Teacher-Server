package com.noteacher.service.impl;

import com.noteacher.entity.ReadLogDataCount;
import com.noteacher.mapper.ReadLogDataCountMapper;
import com.noteacher.service.ReadLogDataCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/29 14:39
 * @Decription :
 */

@Service
public class ReadLongDataCountServiceImpl implements ReadLogDataCountService {

    @Autowired
    private ReadLogDataCountMapper readLogDataCountMapper;

    @Override
    public List<ReadLogDataCount> getReadLogDataCountByUserId(String userId) {
        return readLogDataCountMapper.getReadLogDataCountByUserId(userId);
    }
}
