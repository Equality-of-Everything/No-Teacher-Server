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

//    @Test
//    void userLevelService_getLexileByUserId() {
//        // 创建Gson对象
//        Gson gson = new GsonBuilder().create();
//
//        // 定义集合的类型
//        Type listType = new TypeToken<List<Integer>>() {}.getType();
//        List list = gson.fromJson(userLevelMapper.getKnowWordIdByUserId("02e37658-1604-4292-800d-d3f2a15039a3"), listType);
//        System.out.println(list.size()/96D*100);
//
//    }

    @Test
    void articleServiceTest() {
//        String res = userLevelMapper.getUnknowWordIdByUserId("e9707d25-e87a-4e8d-9dcb-3e99d0e491f7");
//        Gson gson = new Gson();
//        Type listType = new TypeToken<List<Integer>>() {}.getType();
//        List list = gson.fromJson(res, listType);
//        List<WordDetail> wordDetails = wordMapper.wordRec(list, 0*4);
//        System.out.println(wordDetails);

        System.out.println(new Timestamp(System.currentTimeMillis()).toString());
    }


}
