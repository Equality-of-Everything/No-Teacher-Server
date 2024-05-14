package com.noteacher.controller;

import com.noteacher.entity.ArticleTypeList;
import com.noteacher.entity.Result;
import com.noteacher.service.ArticleTypeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/14 8:20
 * @Decription :
 */

@RestController
@RequestMapping("/articleTypeList")
public class ArticleTypeListController {
    @Autowired
    private ArticleTypeListService articleTypeListService;

    @GetMapping("/getAll")
    public Result getAllArticleTypeList() {
        List<ArticleTypeList> res = articleTypeListService.getAllArticleTypeList();
        if(res==null) return new Result(false,"获取失败",null);
        return new Result(true,"获取成功",res);
    }
}
