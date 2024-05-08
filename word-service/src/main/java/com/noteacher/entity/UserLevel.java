package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/8 9:04
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_level")
public class UserLevel {
    private String id;;
    @TableField("user_id")
    private String userId;
    @TableField("unknow_word_id")
    private String unknowWordId;
    @TableField("know_word_id")
    private String knowWordId;
}
