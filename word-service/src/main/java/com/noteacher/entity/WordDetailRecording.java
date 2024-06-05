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
 * @Date : Created in 2024/5/31 15:55
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("word_detail_recording_data")
public class WordDetailRecording {
    private String id;

    @TableField("userId")
    private String userId;

    @TableField("wordId")
    private int wordId;

    private int score;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Timestamp time;
}
