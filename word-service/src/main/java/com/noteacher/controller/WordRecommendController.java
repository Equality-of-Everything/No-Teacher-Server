package com.noteacher.controller;

import com.noteacher.entity.Result;
import com.noteacher.entity.WordDetail;
import com.noteacher.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/22 8:56
 * @Decription : 单词推荐
 */

@RestController
@RequestMapping("/wordRec")
public class WordRecommendController {
    @Autowired
    private WordService wordService;

    @GetMapping("/gerWordRec/{userId}/{currentPage}")
    public Result getWordRec(@PathVariable String userId, @PathVariable int currentPage) {
        List<WordDetail> res = wordService.wordRecommend(userId, currentPage);
        if(res==null) return new Result(false,"推荐单词为空",null);
        return new Result(true,"推荐单词",res);
    }
}
