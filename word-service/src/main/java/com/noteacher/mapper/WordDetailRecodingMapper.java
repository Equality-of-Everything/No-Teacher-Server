package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.WordDetailRecording;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/31 16:01
 * @Decription :
 */

@Mapper
public interface WordDetailRecodingMapper extends BaseMapper<WordDetailRecording> {

    @Select("select * from word_detail_recording_data where userId = #{userId} and month(time) = #{month};")
    List<WordDetailRecording> getToatalRecordingDataByUserIdAndMonth(String userId, String month);
}
