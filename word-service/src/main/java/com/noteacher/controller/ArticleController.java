package com.noteacher.controller;

import com.noteacher.entity.Article;
import com.noteacher.entity.Result;
import com.noteacher.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/13 14:28
 * @Decription :
 */

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 分页获取文章数，每页固定为6个
     * @param lexile
     * @param currentPage
     * @return
     */
    @GetMapping("/{lexile}/{currentPage}")
    public Result getArticleByLexile(@PathVariable int lexile, @PathVariable int currentPage) {
        List<Article> res = articleService.getArticlesByLexile(lexile, currentPage);
        if(res==null) return new Result(false, "该难度没有对应文章", null);
        return new Result(true,  "获取成功", res,200);
    }

    /**
     * 获取文章数目
     * @return
     */
    @GetMapping("/getArticleNum")
    public Result getArticlePage() {
        Integer articleNum = articleService.getArticleNum();
        if(articleNum==0) return new Result(false, "发送未知错误", null);
        return new Result(true, "获取成功", articleNum, 200);
    }


    @GetMapping("/getAllArticles")
    public Result getAllArticle() {
        List<Article> res = articleService.getAllArticle();
        if(res==null) return new Result(false, "发生未知错误", null);
        return new Result(true, "获取成功", res);
    }
}
