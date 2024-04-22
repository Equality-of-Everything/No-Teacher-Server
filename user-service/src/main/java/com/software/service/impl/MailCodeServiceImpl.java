package com.software.service.impl;

import com.software.service.MailCodeService;
import com.software.util.MailCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/22 16:12
 * @Decription :
 */

@Service
public class MailCodeServiceImpl implements MailCodeService {

    @Autowired
    private MailCodeUtil mailCodeUtil;


    @CachePut(value = "mailCode", key = "#mail")
    @Override
    public String generateMailCode(String mail) {
        return mailCodeUtil.generateMailCode();
    }

    @Override
    public boolean checkCode(String mail,String code) {
        return code.equals(mailCodeUtil.getCode(mail));
    }
}
