package com.noteacher.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.noteacher.entity.WordDetail;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.mapper.WordMapper;
import com.noteacher.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 10:00
 * @Decription :
 */

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private UserLevelMapper userLevelMapper;

    @Override
    public Integer getWordNum() {
        return wordMapper.getWordNum();
    }

    @Override
    public List<WordDetail> getLimitWord(int currentPage) {
        return wordMapper.getLimitWord(currentPage*8);
    }

    @Override
    public List<WordDetail> wordRecommend(String userId,int currentPage) {
        String res = userLevelMapper.getUnknowWordIdByUserId(userId);
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        List list = gson.fromJson(res, listType);
        List<WordDetail> resWord = wordMapper.wordRec(list, currentPage * 4);
        return resWord;
    }
}
