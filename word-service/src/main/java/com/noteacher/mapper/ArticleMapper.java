package com.noteacher.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.noteacher.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/13 14:14
 * @Decription :
 */

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    @Select("select * from articles where lexile = #{lexile} limit #{currentPage},5")
    List<Article> getArticleByLexile(int lexile, int currentPage);

    @Select("select count(*) from articles")
    Integer getArticleNum();

    @Select("select count(*) from articles where lexile=#{lexile}")
    Integer getArticleNumByLexile(int lexile);
}
