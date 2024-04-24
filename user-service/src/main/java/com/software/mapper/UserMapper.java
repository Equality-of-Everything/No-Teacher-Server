package com.software.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 8:20
 * @Decription :
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Results(
            @Result(column = "user_id",property = "userId")
    )
    @Select("select * from user where email = #{email}")
    User selectUserByEmail(String email);

    @Update("update user set avatar = #{avatar} where user_id = #{userId}")
    Integer updateUserAvatar(String userId,String avatar);
}
