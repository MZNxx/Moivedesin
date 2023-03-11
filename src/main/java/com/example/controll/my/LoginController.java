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
@RequestMapping("/logingregist")
public class LoginController {
    @Resource
    private SwipperMapper swipperMapper;
    @ApiOperation("登陆")
    @GetMapping("/login")
    public String login(@RequestBody User user){
        String uname = user.getUsername();
        String pwd = user.getPassword();
        if(uname != null && pwd != null){

        }
        return "登陆失败";
    }
}
