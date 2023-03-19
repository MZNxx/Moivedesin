package com.example.service.impl;

import com.example.mapper.article.ArticleMapper;
import com.example.pojo.Article;
import com.example.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    /**
     * 根据id查找文章内容：包括文章标题、文章图片等属性值
     * @param aid
     * @return
     */
    @Override
    public Article findByid(int aid) {
        return articleMapper.selectById(aid);
    }
}
