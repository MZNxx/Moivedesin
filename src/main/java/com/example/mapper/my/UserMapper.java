package com.example.mapper.my;

import ch.qos.logback.classic.spi.EventArgUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Wrapper;

@Mapper
@Transactional
@EnableTransactionManagement
public interface UserMapper extends BaseMapper<User> {
    //登陆
    @Select("select * from user where username=#{username} and password=#{password}")
    User login(@Param("username")String username,@Param("password")String password);
    //注册
    @Update("insert into user values(#{username},#{password})")
    void register(User user);
    //注册时判断用户是否存在
    @Select("select * from user where username=#{username}")
    User registerByname(String name);
}
