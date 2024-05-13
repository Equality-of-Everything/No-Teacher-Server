package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/13 14:08
 * @Decription :
 */


@TableName("articles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private int id;

    @TableField("isRead")
    private int isRead;

    private String title;

    @TableField("wordNum")
    private int wordNum;

    private int lexile;

    @TableField("typeId")
    private int typeId;

    private String type;

    private String cover;

    private String content;

    @TableField("user_id")
    private String userId;
}