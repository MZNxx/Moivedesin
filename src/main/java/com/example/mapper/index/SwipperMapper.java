package com.example.mapper.index;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Swipper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SwipperMapper extends BaseMapper<Swipper> {
    @Select("select simg from swipper")
    List<String> selectByC();

}
