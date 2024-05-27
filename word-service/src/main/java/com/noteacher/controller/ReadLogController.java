package com.noteacher.controller;

import com.google.gson.Gson;
import com.noteacher.entity.ReadLog;
import com.noteacher.entity.Result;
import com.noteacher.service.ReadLogService;
import com.noteacher.util.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/24 14:20
 * @Decription :
 */

@RestController
@RequestMapping("/readLog")
public class ReadLogController {
    @Autowired
    private ReadLogService readLogService;


    @PostMapping("/insert")
    public Result insertReadLog(@RequestParam String json_readLog) {
        ReadLog readLog = GsonUtils.getGsonInstance().fromJson(json_readLog, ReadLog.class);
        System.out.println(readLog.toString());
        Integer res = readLogService.addReadLog(readLog);
        if (res < 1) return new Result(false, 500, "插入失败", null);
        return new Result(true, 200, "插入成功", readLog);
    }

    @GetMapping("/{userId}")
    public Result getTodayReadDurationByUserId(@PathVariable String userId) {
        Long res = readLogService.getTodayReadDurationByUserId(userId);
        if(res == null) return new Result(false, 500, "查询失败或该用户未有阅读记录", null);
        return new Result(true, 200, "查询成功", res);
    }
}
