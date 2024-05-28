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

    /**
     * 获取今日的阅读时长
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public Result getTodayReadDurationByUserId(@PathVariable String userId) {
        Long res = readLogService.getTodayReadDurationByUserId(userId);
        if(res == null) return new Result(false, 500, "查询失败或该用户未有阅读记录", null);
        return new Result(true, 200, "查询成功", res);
    }

    /**
     * 获取总单词数目
     * @param userId
     * @return
     */
    @GetMapping("/totalWord/{userId}")
    public Result getTotalWordNum(@PathVariable String userId) {
        Integer res = readLogService.getTotalWordNumByUserId(userId);
        if(res == null) return new Result(false, 500, "查询失败或该用户未有阅读记录", null);
        return new Result(true, 200, "查询成功", res);
    }

    /**
     * 获取文章中单词的认识数
     * @param userId
     * @return
     */
    @GetMapping("/wordNum/{userId}")
    public Result getTodayReadWordNumByuserId(@PathVariable String userId) {
        Integer res = readLogService.getTodayReadArticleWordNumByUserId(userId);
        if(res == null) return new Result(false, 500, "查询失败或该用户未有阅读记录", null);
        return new Result(true, 200, "查询成功", res);
    }
}
