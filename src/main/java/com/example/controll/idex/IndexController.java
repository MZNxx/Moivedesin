package com.example.controll.idex;

import com.example.pojo.dto.index.MposterDTO;
import com.example.service.SwipperService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "首页")
@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    private SwipperService swipperService;
    @ApiOperation("获取轮播图url地址")
    @GetMapping("/getswipper")
    public List<String> seletByC(){
        MposterDTO mpdto = new MposterDTO();
        return mpdto.setM(swipperService.selectByC());
    }
}
