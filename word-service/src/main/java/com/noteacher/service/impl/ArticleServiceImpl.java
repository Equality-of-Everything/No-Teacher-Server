package com.noteacher.service.impl;

import com.noteacher.entity.Article;
import com.noteacher.mapper.ArticleMapper;
import com.noteacher.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/13 14:19
 * @Decription :
 */

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> getArticlesByLexile(int lexile,int currentPage) {
        List<Article> res = articleMapper.getArticleByLexile(lexile,currentPage*5);
        return res;
    }

    @Override
    public Integer getArticleNum() {
        return articleMapper.getArticleNum();
    }

    @Override
    public List<Article> getAllArticle() {
        return articleMapper.selectList(null);
    }

    @Override
    public Integer getArticleByLexileNum(int lexile) {
        return articleMapper.getArticleNumByLexile(lexile);
    }
}
