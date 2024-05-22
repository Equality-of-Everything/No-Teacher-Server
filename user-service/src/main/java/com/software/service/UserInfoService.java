package com.software.service;

import entity.User;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 9:59
 * @Decription :
 */

public interface UserInfoService {
    Integer updateUserAvatar(String userId,String avatar);

    Integer UpdateUserInfo(String userId, String userName, String avatar, String birthdate, String sex);

    User getUserByUserId(String userId);



}





