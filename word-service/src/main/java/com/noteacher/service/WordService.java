package com.noteacher.service;

import com.noteacher.entity.WordDetail;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 9:59
 * @Decription :
 */

public interface WordService {
    Integer getWordNum();

    List<WordDetail> getLimitWord(int currentPage);

    // 根据未知单词去推荐
    List<WordDetail> wordRecommend(String userId,int currentPage);
}
