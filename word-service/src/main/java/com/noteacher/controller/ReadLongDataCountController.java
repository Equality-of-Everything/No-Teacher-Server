package com.noteacher.controller;

import com.noteacher.entity.ReadLogDataCount;
import com.noteacher.entity.Result;
import com.noteacher.service.ReadLogDataCountService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/29 14:40
 * @Decription :
 */

@RestController
@RequestMapping("/dataCount")
public class ReadLongDataCountController {

    @Autowired
    private ReadLogDataCountService readLogDataCountService;

    @GetMapping("/{userId}")
    public Result getReadLongDataCountByUserId(@PathVariable String userId) {
        List<ReadLogDataCount> res = readLogDataCountService.getReadLogDataCountByUserId(userId);
        if(res==null) return new Result(false, "查询失败", null);
        return new Result(true, "查询成功", res);
    }
}
