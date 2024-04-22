package com.software.service;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/22 16:11
 * @Decription :
 */

public interface MailCodeService {
    /**
     * 用于生成邮箱验证码
     * @return
     */
    public String generateMailCode(String mail);

    /**
     * 用于验证邮箱验证码
     */
    public boolean checkCode(String mail,String code);
}
