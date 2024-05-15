package com.noteacher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.noteacher.mapper.UserLevelMapper;
import com.noteacher.service.UserLevelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Type;
import java.util.List;

@SpringBootTest
class WordServiceApplicationTests {

    @Autowired
    private UserLevelService userLevelService;

    @Autowired
    private UserLevelMapper userLevelMapper;

    @Test
    void userLevelService_getLexileByUserId() {
        // 创建Gson对象
        Gson gson = new GsonBuilder().create();

        // 定义集合的类型
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        List list = gson.fromJson(userLevelMapper.getKnowWordIdByUserId("02e37658-1604-4292-800d-d3f2a15039a3"), listType);
        System.out.println(list.size()/96D*100);

    }
}
