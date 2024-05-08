package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.UserLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/8 9:10
 * @Decription :
 */

@Mapper
public interface UserLevelMapper extends BaseMapper<UserLevel> {

    @Results(
            {@Result(column = "user_id", property = "userId"),
            @Result(column = "know_word_id", property = "knowWordId"),
            @Result(column = "unknow_word_id", property = "unknowWordId")}
    )
    @Select("select * from user_level where user_id = #{userId}")
    UserLevel getUserLevelByUserId(String userId);

}
