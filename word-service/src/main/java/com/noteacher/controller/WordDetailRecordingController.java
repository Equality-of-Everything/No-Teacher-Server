package com.noteacher.controller;

import com.noteacher.entity.Result;
import com.noteacher.entity.WordDetailRecording;
import com.noteacher.service.WordDetailRecodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/6/3 14:13
 * @Decription :
 */


@RestController
@RequestMapping("/recording")
public class WordDetailRecordingController {

    @Autowired
    private WordDetailRecodingService wordDetailRecodingService;

    @PostMapping("/insertData")
    public Result insertData(@RequestBody WordDetailRecording wordDetailRecording) {
        Integer res = wordDetailRecodingService.insertData(wordDetailRecording);
        if (res < 1) return new Result(false, "插入失败", null);
        return new Result(true, "插入成功", res);
    }

    @GetMapping("/{userId}/{month}")
    public Result getRecordingData(@PathVariable String userId,@PathVariable String month) {
        List<WordDetailRecording> res = wordDetailRecodingService.getToatalRecordingDataByUserIdAndMonth(userId, month);
        if(res == null) return new Result(false, "查询失败", null);
        return new Result(true, "获取数据成功", res);
    }
}
