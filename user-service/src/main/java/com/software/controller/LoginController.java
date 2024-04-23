package com.software.controller;

import com.noteacher.result.Result;
import com.software.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author : Zhang
 * @Date : Created in 2024/4/23 9:03
 * @Decription :
 */

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private MailCodeController mailCodeController;

    @PostMapping("/login")
    public Result login(String email) {
        loginService.login(email);
        Result result = mailCodeController.sendMailCode(email);
        return result;
    }

    @PostMapping("/checkLogin")
    public Result checkLogin(String email, String code) {
        return mailCodeController.checkCode(email, code);
    }
}
