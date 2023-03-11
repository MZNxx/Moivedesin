package com.example.mapper.recommend;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.RecommendList;
import com.example.pojo.dto.recommend.Rlistdto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RecommendMapper extends BaseMapper<RecommendList> {
}
