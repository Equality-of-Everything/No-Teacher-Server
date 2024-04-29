package com.noteacher.controller;

import com.noteacher.entity.WordDetail;
import com.noteacher.entity.Result;
import com.noteacher.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 10:01
 * @Decription :
 */

@RestController
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService wordservice;

    @GetMapping("/getWordNum")
    public Result getWordNum() {
        Integer num = wordservice.getWordNum();
        return new Result(true,"success",num,200);
    }

    @GetMapping("/getWords")
    public Result getLimitWord(@RequestParam int currentPage) {
        List<WordDetail> limitWord = wordservice.getLimitWord(currentPage);
        if(limitWord==null) return new Result(false,"fail",null,400);
        return new Result(true,"success",limitWord,200);
    }

}
