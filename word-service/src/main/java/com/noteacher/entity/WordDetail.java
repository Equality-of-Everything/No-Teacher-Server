package com.noteacher.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 9:20
 * @Decription :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("word_details")
public class WordDetail {
    private int id;
    private String word;
    private int partOfSpeech;
    private String phoneticSymbol;
    private String pronunciation;
    private String paraphrase;
    private String paraphraseVideo;
    private String paraphrasePicture;

}
