package com.example.service;

import com.example.pojo.RecommendList;
import com.example.pojo.dto.recommend.Rlistdto;

import java.sql.Wrapper;
import java.util.List;

public interface RecommendService {

    List<RecommendList> selectAll();
}
