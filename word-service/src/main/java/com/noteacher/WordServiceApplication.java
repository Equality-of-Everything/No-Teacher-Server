package com.noteacher;

import com.noteacher.controller.WordController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages ="com.noteacher.*")
//@MapperScan("com.noteacher.mapper")
public class WordServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordServiceApplication.class, args);
    }

}
