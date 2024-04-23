package com.software.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 8:20
 * @Decription :
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where email = #{email}")
    User selectUserByEmail(String email);
}
