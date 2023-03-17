package com.example.service.impl;

import com.example.mapper.my.UserMapper;
import com.example.pojo.User;
import com.example.service.LoginCheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoginCheckServiceImpl implements LoginCheckService {
    @Resource
     private UserMapper userMapper;
    @Override
    public Boolean checkstatus(User user) {
        String uname = user.getUsername();
        String pwd = user.getPassword();
        if(uname != null){
            List<User> list = new ArrayList<>();
            list.add( userMapper.registerByname(uname));
            switch ("list"){
                case "1":
                    
            }

        }
        return null;
    }
}
