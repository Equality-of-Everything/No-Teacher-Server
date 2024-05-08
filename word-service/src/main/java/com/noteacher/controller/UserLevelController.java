package com.noteacher.controller;

import com.noteacher.entity.Result;
import com.noteacher.entity.UserLevel;
import com.noteacher.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/8 9:22
 * @Decription :
 */

@RestController
@RequestMapping("/userLevel")
public class UserLevelController {
    @Autowired
    private UserLevelService userLevelService;

    @PostMapping("/insertData")
    public Result insertData(String userId, String unKnowWordId, String knowWordId) {
        Integer res = userLevelService.insertUserLevel(userId, unKnowWordId, knowWordId);
        if (res > 0) return new Result(true, "插入成功", null);
        return new Result(false, "插入失败", null);
    }

    @GetMapping("/{userId}")
    public Result getUserLevelByUserId(@PathVariable String userId) {
        UserLevel res = userLevelService.getUserLevelByUserId(userId);
        if(res==null) return new Result(false, "查询失败", null);
        return new Result(true, "查询成功", res);
    }
}
