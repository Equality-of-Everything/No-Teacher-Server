package com.software.controller;

import com.noteacher.controller.UploadFileController;
import com.noteacher.result.Result;
import com.software.client.UploadFileClient;
import com.software.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping("/updateAvatar")
    public Result updateAvatar(String userId, @RequestParam MultipartFile file) {
        Result result = uploadFileClient.uploadFile(file);
        String avatar = (String) result.getData();
        boolean flag = userInfoService.updateUserAvatar(userId, avatar) > 0;
        return new Result(flag, flag ? "更新头像成功" : "更新头像失败", null);
    }
}
