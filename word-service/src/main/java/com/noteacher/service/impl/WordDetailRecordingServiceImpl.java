package com.noteacher.service.impl;

import com.noteacher.entity.WordDetailRecording;
import com.noteacher.mapper.WordDetailRecodingMapper;
import com.noteacher.service.WordDetailRecodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/6/3 14:06
 * @Decription :
 */

@Service
public class WordDetailRecordingServiceImpl implements WordDetailRecodingService {

    @Autowired
    private WordDetailRecodingMapper wordDetailRecodingMapper;

    @Override
    public Integer insertData(WordDetailRecording wordDetailRecording) {
        return wordDetailRecodingMapper.insert(wordDetailRecording);
    }

    @Override
    public List<WordDetailRecording> getToatalRecordingDataByUserIdAndMonth(String userId, String month) {
        return wordDetailRecodingMapper.getToatalRecordingDataByUserIdAndMonth(userId,month);
    }
}
