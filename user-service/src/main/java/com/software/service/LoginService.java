package com.software.service;

import entity.User;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 8:27
 * @Decription :
 */

public interface LoginService {
    User login(String email);
}
