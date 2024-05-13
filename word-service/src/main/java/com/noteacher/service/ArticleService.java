package com.noteacher.service;

import com.noteacher.entity.Article;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/13 14:14
 * @Decription :
 */

public interface ArticleService {
    List<Article> getArticlesByLexile(int lexile,int currentPage);

    Integer getArticleNum();

    List<Article> getAllArticle();
}
