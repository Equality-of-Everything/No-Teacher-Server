package com.noteacher.service.impl;

import com.noteacher.entity.ArticleTypeList;
import com.noteacher.mapper.ArticleTypeListMapper;
import com.noteacher.service.ArticleService;
import com.noteacher.service.ArticleTypeListService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/14 8:16
 * @Decription :
 */

@Service
public class ArticleTypeListImpl implements ArticleTypeListService {
    @Autowired
    private ArticleTypeListMapper articleTypeMapMapper;
    @Override
    public List<ArticleTypeList> getAllArticleTypeList() {
        return articleTypeMapMapper.selectList(null);
    }
}
