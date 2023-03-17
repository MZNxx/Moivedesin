package com.example.mapper.recommend;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.RecommendList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecommendMapper extends BaseMapper<RecommendList> {
}
