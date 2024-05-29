package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/29 14:29
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("readlog_data_count")
public class ReadLogDataCount {

    @TableId
    private String id;

    @TableField("userId")
    private String userId;

    @TableField("today")
    private Timestamp today;

    @TableField("totalReadDuration")
    private Long totalReadDuration;

    @TableField("totalReadArticleWordNum")
    private Integer totalReadWordNum;
}
