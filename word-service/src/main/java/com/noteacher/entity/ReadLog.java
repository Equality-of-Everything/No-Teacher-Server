package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/23 10:45
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("readlog")
public class ReadLog {
    private String id;
    @TableField(value = "userId")
    private String userId;
    @TableField(value = "startTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Timestamp startTime;
    @TableField(value = "endTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Timestamp endTime;
    @TableField(value ="readDuration")
    private long readDuration;
    @TableField("articleId")
    private int articleId;
}
