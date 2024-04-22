package com.software.util;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/22 15:13
 * @Decription :
 */

@Component
public class MailCodeUtil {

    /**
     * 生成6位邮箱验证码
     * @param
     * @return
     */
    public String generateMailCode() {
        return String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
    }

    /**
     * 从缓存区中取邮箱验证码
     * @param
     * @return
     */
    @Cacheable(value = "mailCode", key = "#mail")
    public String getCode(String mail) {
        return null;
    }
}
