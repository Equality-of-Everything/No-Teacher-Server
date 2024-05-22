package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.WordDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/4/28 9:31
 * @Decription :
 */

@Mapper
public interface WordMapper extends BaseMapper<WordDetail> {
    @Select("select count(*) from word_details")
    Integer getWordNum();

    @Select("select * from word_details limit #{currentPage},8")
    List<WordDetail> getLimitWord(int currentPage);


    @Select("<script>" +
            "SELECT * FROM word_details " +
            "WHERE id IN " +
            "<foreach item='item' index='index' collection='idList' open='(' separator=',' close=')'>" +
            "#{item}" +
            "</foreach> " +
            "LIMIT #{currentPage}, 4" +
            "</script>")
    List<WordDetail> wordRec(@Param("idList") List<String> idList,@Param("currentPage") int currentPage);
}
