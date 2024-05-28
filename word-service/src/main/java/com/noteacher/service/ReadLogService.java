package com.noteacher.service;

import com.noteacher.entity.ReadLog;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/24 14:14
 * @Decription :
 */

public interface ReadLogService {
    Integer addReadLog(ReadLog readLog);

    Long getTodayReadDurationByUserId(String userId);

    Integer getTotalWordNumByUserId(String userId);

    Integer getTodayReadArticleWordNumByUserId(String userId);
}
