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

    @Update("update user set username = #{userName}, avatar = #{avatar}, birthdate = #{birthdate}, sex = #{sex} where user_id = #{userId} ")
    Integer UpdateUserInfo(String userId, String userName, String avatar, String birthdate, String sex);

    @Update("update user set level = #{lexile} where user_id = #{userId}")
    Integer updateUserLexile(String userId, Integer lexile);

    @Results(
            @Result(column = "user_id",property = "userId")
    )
    @Select("select * from user where user_id = #{userId}")
    User selectUserById(String userId);
}
