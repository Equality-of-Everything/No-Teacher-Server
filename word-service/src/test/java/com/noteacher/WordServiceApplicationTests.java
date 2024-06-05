package com.noteacher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.noteacher.entity.WordDetail;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.mapper.WordMapper;
import com.noteacher.service.ArticleService;
import com.noteacher.service.UserLevelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class WordServiceApplicationTests {

    @Autowired
    private UserLevelService userLevelService;

    @Autowired
    private UserLevelMapper userLevelMapper;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private WordMapper wordMapper;
    @Test
    void articleServiceTest() {
        Integer a = 127;
        Integer b =  127;
        System.out.println(a==b);
    }


}
