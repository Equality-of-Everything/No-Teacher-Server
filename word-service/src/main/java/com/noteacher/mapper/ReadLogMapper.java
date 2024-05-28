package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.ReadLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/23 10:58
 * @Decription :
 */

@Mapper
public interface ReadLogMapper extends BaseMapper<ReadLog> {

    @Select("SELECT SUM(readDuration) AS totalReadDuration\n" +
            "FROM ReadLog\n" +
            "WHERE DATE(startTime) = CURDATE() and userId = #{userId};\n")
    Long getTodayReadDuration(String userId);

    @Select("SELECT SUM(readWordNum) AS totalReadDuration\n" +
            "FROM ReadLog\n" +
            "WHERE DATE(startTime) = CURDATE() and userId = #{userId};\n")
    Integer getTodayReadArticleWordNumByUserId(String userId);
}
