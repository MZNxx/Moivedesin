package com.example.controll.idex;

import com.example.pojo.Hotmovie;
import com.example.pojo.RecommendList;
import com.example.pojo.dto.index.SwipperDTO;
import com.example.service.IndexService;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "首页")
@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    private IndexService indexService;

    @ApiOperation("获取轮播图url地址")
    @GetMapping("/getswipper")
    public List<String> seletByC(){
        SwipperDTO sdto = new SwipperDTO();
        return sdto.setM(indexService.selectByC());
    }

    @ApiOperation("获取热门影片数据")
    @GetMapping("/gethotmovie")
    public String seletAll(){
        List<Hotmovie> hotmovies = indexService.selectAll();
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (Hotmovie hmovie : hotmovies) {
            map = new HashMap<>();
            map.put("mid", hmovie.getMid());
            map.put("mname", hmovie.getMname());
            map.put("murl", hmovie.getMurl());
            map.put("score", hmovie.getScore());
            map.put("tags", hmovie.getTags());
            map.put("mdate", hmovie.getMdate());
            map.put("mcontent", hmovie.getMcontent());
            map.put("articleurl", hmovie.getArticleurl());
            result.add(map);
        }
        Gson gson = new Gson();
        return gson.toJson(result);
    }
}
