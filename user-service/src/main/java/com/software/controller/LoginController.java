package com.software.controller;

import com.noteacher.result.Result;
import com.software.service.LoginService;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public Result login(@RequestParam String email) {
        User user = loginService.login(email);
        Result result = mailCodeController.sendMailCode(email);
        result.setData(user);
        return result;
    }

    @PostMapping("/checkLogin")
    public Result checkLogin(@RequestParam String email,@RequestParam String code) {
        return mailCodeController.checkCode(email, code);
    }
}
