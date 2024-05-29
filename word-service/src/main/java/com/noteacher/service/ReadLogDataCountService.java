package com.noteacher.service;

import com.noteacher.entity.ReadLogDataCount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/29 14:38
 * @Decription :
 */


public interface ReadLogDataCountService {
    List<ReadLogDataCount> getReadLogDataCountByUserId(String userId);
}
