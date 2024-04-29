package com.noteacher.service.impl;

import com.noteacher.entity.WordDetail;
import com.noteacher.mapper.WordMapper;
import com.noteacher.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 10:00
 * @Decription :
 */

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public Integer getWordNum() {
        return wordMapper.getWordNum();
    }

    @Override
    public List<WordDetail> getLimitWord(int currentPage) {
        return wordMapper.getLimitWord(currentPage);
    }
}
