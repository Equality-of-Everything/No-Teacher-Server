package com.software.controller;

import com.noteacher.entity.Result;
import com.software.client.UploadFileClient;
import com.software.mapper.UserMapper;
import com.software.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/24 9:13
 * @Decription :
 */

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UploadFileClient uploadFileClient;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/updateAvatar")
    public Result updateAvatar(String userId, @RequestParam MultipartFile file) {
        Result result = uploadFileClient.uploadFile(file);
        String avatar = (String) result.getData();
        boolean flag = userInfoService.updateUserAvatar(userId, avatar) > 0;
        return new Result(flag, flag ? "更新头像成功" : "更新头像失败", null);
    }

    @PostMapping("/addUser")
    public Result addUserInfo(@RequestParam String userId,
                              @RequestParam String userName, @RequestParam MultipartFile file,
                              @RequestParam String birthdate, @RequestParam String sex) {
        Result result = uploadFileClient.uploadFile(file);
        String avatar = (String) result.getData();
        boolean flag = userInfoService.UpdateUserInfo(userId, userName, avatar, birthdate, sex) > 0;
        return new Result(flag, flag ? "更新用户信息成功" : "更新用户信息失败", null);
    }


    @PostMapping("/updateLexile")
    public Result updateLexile(@RequestParam String userId,@RequestParam String lexile) {
        Integer lexile1 = Integer.parseInt(lexile);
        boolean flag = userMapper.updateUserLexile(userId, lexile1) > 0;
        return new Result(flag, flag ? "更新Lexile成功" : "更新Lexile失败", null);
    }
}




