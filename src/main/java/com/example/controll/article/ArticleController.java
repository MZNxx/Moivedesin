package com.example.controll.article;

import com.example.pojo.Article;
import com.example.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "电影资讯文章")
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    /**
     *根据id返回文章数据接口
     */
    @GetMapping("/click{id}")
    public Article findByid(@PathVariable("id")int aid){
        return articleService.findByid(aid);
    }
}
