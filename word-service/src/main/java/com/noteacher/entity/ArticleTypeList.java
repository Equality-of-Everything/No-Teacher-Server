package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/14 8:14
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("article_type_list")
public class ArticleTypeList {
    private int id;
    private String type;
}
