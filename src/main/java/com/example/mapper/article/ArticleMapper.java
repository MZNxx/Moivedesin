package com.example.mapper.article;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
