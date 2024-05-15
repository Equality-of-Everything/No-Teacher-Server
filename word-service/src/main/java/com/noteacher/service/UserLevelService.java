package com.noteacher.service;

import com.noteacher.entity.UserLevel;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/8 9:16
 * @Decription :
 */

public interface UserLevelService {
    Integer insertUserLevel(String userId,String unknowWordId,String knowWordId);

    UserLevel getUserLevelByUserId(String userId);

    Integer getLexileByUserId(String userId);
}
