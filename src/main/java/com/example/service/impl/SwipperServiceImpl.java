package com.example.service.impl;

import com.example.mapper.index.SwipperMapper;
import com.example.service.SwipperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SwipperServiceImpl implements SwipperService {
    @Resource
    private SwipperMapper swipperMapper;

    @Override
    public List<String> selectByC() {
        return swipperMapper.selectByC();
    }
}
