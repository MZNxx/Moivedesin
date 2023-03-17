package com.example.controll.my;

import com.example.mapper.index.SwipperMapper;
import com.example.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "我的界面")
@RestController
@RequestMapping("/my")
public class LoginController {
    @Resource
    private SwipperMapper swipperMapper;
    @ApiOperation("注册登陆")
    @GetMapping("/loginorregist")
    public String login(@RequestBody User user){

        return "登陆失败";
    }
}
