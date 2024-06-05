package com.noteacher.service;

import com.noteacher.entity.WordDetailRecording;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/31 16:02
 * @Decription :
 */

public interface WordDetailRecodingService {
    Integer insertData(WordDetailRecording wordDetailRecording);

    List<WordDetailRecording> getToatalRecordingDataByUserIdAndMonth(String userId, String month);
}
