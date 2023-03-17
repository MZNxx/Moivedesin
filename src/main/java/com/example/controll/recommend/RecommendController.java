package com.example.controll.recommend;

import com.example.pojo.RecommendList;
import com.example.pojo.dto.recommend.Rlistdto;
import com.example.service.RecommendService;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "推荐页")
@RestController
@RequestMapping("/getimgurl")
public class RecommendController {

    @Resource
    private RecommendService recommendService;
    @ApiOperation("获取排行榜数据")
    @GetMapping("/getrecommend")
    @RequestBody
    public String getrecommend(){
        List<RecommendList> recommendLists = recommendService.selectAll();
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (RecommendList rlist : recommendLists) {
            map = new HashMap<>();
            map.put("rid", rlist.getRid());
            map.put("rno", rlist.getRno());
            map.put("rimg", rlist.getRimg());
            map.put("rtitle", rlist.getRtitle());
            map.put("rcontent", rlist.getRcontent());
            result.add(map);
        }
        Gson gson = new Gson();
        return gson.toJson(result);
    }
}
