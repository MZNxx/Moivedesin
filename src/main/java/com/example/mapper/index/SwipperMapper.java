package com.example.mapper.index;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SwipperMapper extends BaseMapper<Movie> {
    @Select("select mposter from zyj")
    List<String> selectByC();

}
