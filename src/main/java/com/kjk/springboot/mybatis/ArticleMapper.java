package com.kjk.springboot.mybatis;

import com.kjk.springboot.web.dto.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ArticleMapper {
    @Select("SELECT * FROM ARTICLE WHERE id = #{id}")
    Article geetArticle(@Param("id") Long id);
}