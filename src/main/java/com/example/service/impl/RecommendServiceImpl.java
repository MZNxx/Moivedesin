package com.example.service.impl;

import com.example.mapper.recommend.RecommendMapper;
import com.example.pojo.RecommendList;
import com.example.pojo.dto.recommend.Rlistdto;
import com.example.service.RecommendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

@Service
public class RecommendServiceImpl implements RecommendService {
    @Resource
    private RecommendMapper recommendMapper;
    @Override
    public List<RecommendList> selectAll() {
        return recommendMapper.selectList(null);
    }
}
