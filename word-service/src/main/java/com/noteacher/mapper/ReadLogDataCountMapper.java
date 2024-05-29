package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.ReadLogDataCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/29 14:35
 * @Decription :
 */

@Mapper
public interface ReadLogDataCountMapper extends BaseMapper<ReadLogDataCount> {

    @Results({
            @Result(column = "total_readDuration", property = "totalReadDuration"),
            @Result(column = "total_readWordNum", property = "totalReadWordNum")}
    )
    @Select("SELECT * FROM readlog_data_count WHERE userId = #{userId}")
    List<ReadLogDataCount> getReadLogDataCountByUserId(String userId);
}
